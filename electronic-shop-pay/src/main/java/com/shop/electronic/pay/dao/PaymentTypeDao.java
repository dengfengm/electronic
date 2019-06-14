package com.shop.electronic.pay.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;

import com.shop.electronic.payapi.entity.PaymentType;

@Mapper
public interface PaymentTypeDao {

	@Select("select * from payment_type where payment_type_id = #{paymentTypeId}")
	public PaymentType getPaymentType(@Param("paymentTypeId") String paymentTypeId);

}
