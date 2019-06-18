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
	public String getPaymentTypeId() {
		return paymentTypeId;
	}
	public void setPaymentTypeId(String paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getFrontUrl() {
		return frontUrl;
	}
	public void setFrontUrl(String frontUrl) {
		this.frontUrl = frontUrl;
	}
	public String getBackUrl() {
		return backUrl;
	}
	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	
}