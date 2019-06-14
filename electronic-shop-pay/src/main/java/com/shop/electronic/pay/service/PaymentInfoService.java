package com.shop.electronic.pay.service;

import com.shop.electronic.common.utils.PageDataOutput;
import com.shop.electronic.payapi.entity.PaymentInfo;

public interface PaymentInfoService {

	/**
	 * 换取支付令牌
	 * 
	 * @return
	 */
	PageDataOutput addPayInfoToken(PaymentInfo paymentInfo);

	/**
	 * 使用token查找支付信息
	 * 
	 * @param paymentInfo
	 * @return
	 */
	PageDataOutput getPayInfoToken(String token);

	/**
	 * 使用token查找支付信息
	 * 
	 * @param paymentInfo
	 * @return
	 */
	public PageDataOutput getByOrderIdPayInfo(String orderId);
	
	/**
	 * 使用token查找支付信息
	 * 
	 * @param paymentInfo
	 * @return
	 */
	public PageDataOutput updatePayInfo(PaymentInfo paymentInfo);
}
