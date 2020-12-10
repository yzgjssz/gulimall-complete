package com.atguigu.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 积分变化历史记录
 *
 * @author yinzg
 * @email yzgjssz@163.com
 * @date 2020-09-02 16:33:21
 */
@Data
@TableName("ums_integration_change_history")
public class IntegrationChangeHistoryEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * $column.comments
     */
    @TableId
    private Long id;
    /**
     * $column.comments
     */
    private Long memberId;
    /**
     * $column.comments
     */
    private Date createTime;
    /**
     * $column.comments
     */
    private Integer changeCount;
    /**
     * $column.comments
     */
    private String note;
    /**
     * $column.comments
     */
    private Integer sourceTyoe;

}
