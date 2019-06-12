package com.shop.electronic.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shop.electronic.common.api.BaseApiService;
import com.shop.electronic.dao.PaymentTypeDao;
import com.shop.electronic.entity.PaymentType;
import com.shop.electronic.service.PaymentTypeService;

@Service
@RestController
@RequestMapping("/pay")
public class PaymentTypeServiceImpl extends BaseApiService implements PaymentTypeService {
	@Autowired
	private PaymentTypeDao paymentTypeDao;

	@RequestMapping("/getPaymentType")
	public Map<String, Object> getPaymentType(@RequestParam("id") Long id) {
		PaymentType paymentType = paymentTypeDao.getPaymentType(id);
		if (paymentType == null) {
			return setResutError("未查找到类型");
		}
		return setResutSuccessData(paymentType);
	}

}
