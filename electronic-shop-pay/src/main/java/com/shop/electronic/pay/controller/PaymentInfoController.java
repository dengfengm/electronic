package com.shop.electronic.pay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shop.electronic.common.api.BaseApiService;
import com.shop.electronic.common.utils.PageDataOutput;
import com.shop.electronic.pay.service.PaymentInfoService;
import com.shop.electronic.payapi.entity.PaymentInfo;
import com.shop.electronic.payapi.feignservice.PaymentInfoFeignService;

@RestController
@RequestMapping("/pay")
public class PaymentInfoController extends BaseApiService implements PaymentInfoFeignService {
	@Autowired
	private PaymentInfoService paymentInfoService;

	public PageDataOutput addPayInfoToken(@RequestBody PaymentInfo paymentInfo) {
		return paymentInfoService.addPayInfoToken(paymentInfo);
	}

	@Override
	public PageDataOutput getPayInfoToken(@RequestParam("token") String token) {
		return paymentInfoService.getPayInfoToken(token);
	}

	@Override
	public PageDataOutput getByOrderIdPayInfo(@RequestParam("orderId")String orderId) {
		return paymentInfoService.getByOrderIdPayInfo(orderId);
	}

	@Override
	public PageDataOutput updatePayInfo(@RequestBody PaymentInfo paymentInfo) {
		return paymentInfoService.updatePayInfo(paymentInfo);
	}

}
