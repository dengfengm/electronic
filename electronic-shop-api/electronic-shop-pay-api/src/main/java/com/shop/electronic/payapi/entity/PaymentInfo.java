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
	public String getPaymentInfoId() {
		return paymentInfoId;
	}
	public void setPaymentInfoId(String paymentInfoId) {
		this.paymentInfoId = paymentInfoId;
	}
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getPlatformorderId() {
		return platformorderId;
	}
	public void setPlatformorderId(String platformorderId) {
		this.platformorderId = platformorderId;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getPayMessage() {
		return payMessage;
	}
	public void setPayMessage(String payMessage) {
		this.payMessage = payMessage;
	}


}
