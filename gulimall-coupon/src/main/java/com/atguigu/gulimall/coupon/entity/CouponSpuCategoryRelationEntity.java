package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 优惠券分类关联
 *
 * @author yinzg
 * @email yzgjssz@163.com
 * @date 2020-09-02 11:16:06
 */
@Data
@TableName("sms_coupon_spu_category_relation")
public class CouponSpuCategoryRelationEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * $column.comments
     */
    @TableId
    private Long id;
    /**
     * $column.comments
     */
    private Long couponId;
    /**
     * $column.comments
     */
    private Long categoryId;
    /**
     * $column.comments
     */
    private String categoryName;

}
