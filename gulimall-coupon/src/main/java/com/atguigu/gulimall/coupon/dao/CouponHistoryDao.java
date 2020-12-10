package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 *
 * @author yinzg
 * @email yzgjssz@163.com
 * @date 2020-09-02 11:16:06
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {

}
