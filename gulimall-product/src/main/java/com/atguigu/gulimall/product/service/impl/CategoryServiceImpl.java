package com.atguigu.gulimall.product.service.impl;

import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;
import com.atguigu.gulimall.product.dao.CategoryDao;
import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.atguigu.gulimall.product.service.CategoryService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        /**
         * 查出所有分类
         * 组装成父子树结构
         */
        List<CategoryEntity> entities = baseMapper.selectList(null);
        /**
         * 找到所有一级分类
         */
        List<CategoryEntity> level1Menus = entities.stream().
                filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                .map((menu)->{
                    menu.setChildren(getChildren(menu,entities));
                    return menu;
                })
                .sorted((menu1,menu2)-> menu1.getSort()==null?0:menu1.getSort()-(menu2.getSort()==null?0:menu2.getSort()))
                .collect(Collectors.toList());

        return level1Menus;
    }

    /**
     * 递归查找子菜单
     * @param root
     * @param all
     * @return
     */
    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all){
        List<CategoryEntity> children = all.stream()
                .filter(categoryEntity -> categoryEntity.getParentCid() == root.getCatId())
                .map((menu)->{
                    menu.setChildren(getChildren(menu,all));
                    return menu;
                })
                .sorted((menu1,menu2)-> menu1.getSort()==null?0:menu1.getSort()-(menu2.getSort()==null?0:menu2.getSort()))
                .collect(Collectors.toList());
        return children;
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {
        //TODO 检查是否被引用
        baseMapper.deleteBatchIds(asList);
    }
}