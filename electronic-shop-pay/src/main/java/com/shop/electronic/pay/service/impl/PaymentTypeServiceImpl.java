package com.shop.electronic.pay.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shop.electronic.common.api.BaseApiService;
import com.shop.electronic.common.utils.PageDataOutput;
import com.shop.electronic.pay.mapper.PaymentTypeMapper;
import com.shop.electronic.pay.service.PaymentTypeService;
import com.shop.electronic.payapi.entity.PaymentType;

@Service
@RestController
@RequestMapping("/pay")
public class PaymentTypeServiceImpl extends BaseApiService implements PaymentTypeService {
	@Autowired
	private PaymentTypeMapper paymentTypeMapper;

	@RequestMapping("/getPaymentType")
	public PageDataOutput getPaymentType(@RequestParam("paymentTypeId") String paymentTypeId) {
		PaymentType paymentType = paymentTypeMapper.getById(paymentTypeId);
		if (paymentType == null) {
			return new PageDataOutput();//"未查找到类型"
		}
		return new PageDataOutput();
	}

}
