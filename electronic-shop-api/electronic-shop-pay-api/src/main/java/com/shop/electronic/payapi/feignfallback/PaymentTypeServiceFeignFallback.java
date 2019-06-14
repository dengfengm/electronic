package com.shop.electronic.payapi.feignfallback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.shop.electronic.common.utils.PageDataOutput;
import com.shop.electronic.payapi.feignservice.PaymentTypeFeignService;

@Component
public class PaymentTypeServiceFeignFallback implements PaymentTypeFeignService{

	private static Logger logger = LoggerFactory.getLogger(PaymentTypeServiceFeignFallback.class);

	@Override
	public PageDataOutput getPaymentType(String paymentTypeId) { 
		logger.info("接口getPaymentType调用失败!");
		return null;
	}

}
