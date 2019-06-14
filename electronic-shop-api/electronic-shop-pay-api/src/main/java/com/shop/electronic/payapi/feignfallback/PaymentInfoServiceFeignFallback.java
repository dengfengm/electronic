package com.shop.electronic.payapi.feignfallback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.shop.electronic.common.utils.PageDataOutput;
import com.shop.electronic.payapi.entity.PaymentInfo;
import com.shop.electronic.payapi.feignservice.PaymentInfoFeignService;

@Component
public class PaymentInfoServiceFeignFallback implements PaymentInfoFeignService{

	private static Logger logger = LoggerFactory.getLogger(PaymentInfoServiceFeignFallback.class);
	@Override
	public PageDataOutput addPayInfoToken(PaymentInfo paymentInfo) {
		logger.info("接口addPayInfoToken调用失败!");
		return null;
	}

	@Override
	public PageDataOutput getPayInfoToken(String token) {
		logger.info("接口getPayInfoToken调用失败!");
		return null;
	}

	@Override
	public PageDataOutput getByOrderIdPayInfo(String orderId) {
		logger.info("接口getByOrderIdPayInfo调用失败!");
		return null;
	}

	@Override
	public PageDataOutput updatePayInfo(PaymentInfo paymentInfo) {
		logger.info("接口updatePayInfo调用失败!");
		return null;
	}

}
