package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 *
 * @author yinzg
 * @email yzgjssz@163.com
 * @date 2020-09-02 16:41:33
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {

}
