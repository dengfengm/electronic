package com.shop.electronic.pay.mapper;

import org.apache.ibatis.annotations.Param;

import com.shop.electronic.common.mapper.MyMapper;
import com.shop.electronic.payapi.entity.PaymentType;

public interface PaymentTypeMapper extends MyMapper<PaymentType>{

	public PaymentType getById(@Param("paymentTypeId")String paymentTypeId);
	
}
