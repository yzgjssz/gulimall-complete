package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 属性&属性分组关联
 *
 * @author yinzg
 * @email yzgjssz@163.com
 * @date 2020-09-01 12:58:48
 */
@Data
@TableName("pms_attr_attrgroup_relation")
public class AttrAttrgroupRelationEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * $column.comments
     */
    @TableId
    private Long id;
    /**
     * $column.comments
     */
    private Long attrId;
    /**
     * $column.comments
     */
    private Long attrGroupId;
    /**
     * $column.comments
     */
    private Integer attrSort;

}
