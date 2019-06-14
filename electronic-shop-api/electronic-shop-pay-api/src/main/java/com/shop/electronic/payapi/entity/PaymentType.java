package com.shop.electronic.payapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.shop.electronic.common.entity.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="PAYMENT_TYPE")
@Getter
@Setter
public class PaymentType extends BaseEntity {
	
	/**
	 * 主键
	 */
	@Id
	@Column(name="PAYMENT_TYPE_ID",length=50)
	private String paymentTypeId;

	/**
	 * 支付平台
	 */
	private String typeName;
	/**
	 * 同步通知
	 */
	private String frontUrl;

	/**
	 * 异步通知
	 */
	private String backUrl;
	/**
	 * 商户id
	 */
	private String merchantId;

}