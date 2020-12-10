package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 商品三级分类
 *
 * @author yinzg
 * @email yzgjssz@163.com
 * @date 2020-09-01 12:58:47
 */
@Data
@TableName("pms_category")
public class CategoryEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * $column.comments
     */
    @TableId
    private Long catId;
    /**
     * $column.comments
     */
    private String name;
    /**
     * $column.comments
     */
    private Long parentCid;
    /**
     * $column.comments
     */
    private Integer catLevel;
    /**
     * $column.comments
     */
    @TableLogic(value = "1", delval = "0")
    private Integer showStatus;
    /**
     * $column.comments
     */
    private Integer sort;
    /**
     * $column.comments
     */
    private String icon;
    /**
     * $column.comments
     */
    private String productUnit;
    /**
     * $column.comments
     */
    private Integer productCount;
    /**
     * 子分类
     */
    @TableField(exist = false)
    private List<CategoryEntity> children;

}
