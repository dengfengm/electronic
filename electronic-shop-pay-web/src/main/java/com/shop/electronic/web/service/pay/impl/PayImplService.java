package com.shop.electronic.web.service.pay.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.shop.electronic.common.utils.PageDataOutput;
import com.shop.electronic.payapi.entity.PaymentInfo;
import com.shop.electronic.payapi.entity.PaymentType;
import com.shop.electronic.payapi.feignservice.PaymentTypeFeignService;
import com.shop.electronic.web.service.pay.PayAdaptService;
import com.shop.electronic.web.service.pay.PayService;
import com.shop.electronic.web.service.pay.yinlian.YinLianPay;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public   class PayImplService implements PayService {
//	@Autowired
//	private PaymentTypeFeignService paymentTypeFeignService;
	@Autowired
    private YinLianPay yinLianPay;
	@Override
	public String pay(PaymentInfo paymentInfo) {
//		String typeId = paymentInfo.getTypeId();
//		PageDataOutput paymentTypeMap = paymentTypeFeignService.getPaymentType(typeId);
//		if (paymentTypeMap == null) {
////			log.error("####pay() typeId:{},paymentTypeMap is null");
//			return null;
//		}
//		Map<String, Object> data = new HashMap<String, Object>();
//		String json = new JSONObject().toJSONString(data);
		PaymentType paymentType = new PaymentType();//new JSONObject().parseObject(json, PaymentType.class);
		paymentType.setMerchantId("777");
		paymentType.setFrontUrl("http://www.baidu.com");
		paymentType.setBackUrl("http://www.baidu.com");
//		if (paymentType == null) {
//			return null;
//		}
		String typeName = "yinlianPay";//paymentType.getTypeName();
		PayAdaptService payAdaptService=null;
		switch (typeName) {
		case "yinlianPay":
			payAdaptService = yinLianPay;
			break;

		default:
			break;
		}
		return payAdaptService.pay(paymentInfo, paymentType);
	}

}
