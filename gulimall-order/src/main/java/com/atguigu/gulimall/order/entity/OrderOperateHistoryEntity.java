package com.atguigu.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 订单操作历史记录
 *
 * @author yinzg
 * @email yzgjssz@163.com
 * @date 2020-09-02 16:41:33
 */
@Data
@TableName("oms_order_operate_history")
public class OrderOperateHistoryEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * $column.comments
     */
    @TableId
    private Long id;
    /**
     * $column.comments
     */
    private Long orderId;
    /**
     * $column.comments
     */
    private String operateMan;
    /**
     * $column.comments
     */
    private Date createTime;
    /**
     * $column.comments
     */
    private Integer orderStatus;
    /**
     * $column.comments
     */
    private String note;

}
