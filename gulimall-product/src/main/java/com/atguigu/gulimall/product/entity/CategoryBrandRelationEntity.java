package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 品牌分类关联
 *
 * @author yinzg
 * @email yzgjssz@163.com
 * @date 2020-09-01 12:58:47
 */
@Data
@TableName("pms_category_brand_relation")
public class CategoryBrandRelationEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * $column.comments
     */
    @TableId
    private Long id;
    /**
     * $column.comments
     */
    private Long brandId;
    /**
     * $column.comments
     */
    private Long catelogId;
    /**
     * $column.comments
     */
    private String brandName;
    /**
     * $column.comments
     */
    private String catelogName;

}
