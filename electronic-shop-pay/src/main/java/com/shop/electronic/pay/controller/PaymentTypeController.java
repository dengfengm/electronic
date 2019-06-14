package com.shop.electronic.pay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shop.electronic.common.api.BaseApiService;
import com.shop.electronic.common.utils.PageDataOutput;
import com.shop.electronic.pay.service.PaymentTypeService;
import com.shop.electronic.payapi.feignservice.PaymentTypeFeignService;

@Service
@RestController
@RequestMapping("/pay")
public class PaymentTypeController extends BaseApiService implements PaymentTypeFeignService {
	@Autowired
	private PaymentTypeService paymentTypeService;

	@RequestMapping("/getPaymentType")
	public PageDataOutput getPaymentType(@RequestParam("paymentTypeId") String paymentTypeId) {
		return paymentTypeService.getPaymentType(paymentTypeId);
	}

}
