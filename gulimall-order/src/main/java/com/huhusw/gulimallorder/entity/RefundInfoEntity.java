package com.huhusw.gulimallorder.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 退款信息
 * 
 * @author huhusw
 * @email zhw969@gmail.com
 * @date 2020-08-23 17:47:16
 */
@Data
@TableName("oms_refund_info")
public class RefundInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Long id;
	/**
	 * $column.comments
	 */
	private Long orderReturnId;
	/**
	 * $column.comments
	 */
	private BigDecimal refund;
	/**
	 * $column.comments
	 */
	private String refundSn;
	/**
	 * $column.comments
	 */
	private Integer refundStatus;
	/**
	 * $column.comments
	 */
	private Integer refundChannel;
	/**
	 * $column.comments
	 */
	private String refundContent;

}
