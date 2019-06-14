package com.shop.electronic.payapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.shop.electronic.common.entity.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="PAYMENT_INFO")
@Getter
@Setter
public class PaymentInfo extends BaseEntity {
	
	/**
	 * 主键
	 */
	@Id
	@Column(name="PAYMENT_INFO_ID",length=50)
	private String paymentInfoId;

	/**
	 * 支付类型
	 */
	
	private String typeId;
	/**
	 * 订单编号
	 */
	private String orderId;
	/**
	 * 第三方平台支付id
	 */
	private String platformorderId;
	/**
	 * 价格 以分为单位
	 */
	private String price;
	/**
	 * 支付来源
	 */
	private String source;
	/**
	 * 支付来源
	 */
	private Integer state;
	/**
	 * 支付报文
	 */
	private String payMessage;


}
