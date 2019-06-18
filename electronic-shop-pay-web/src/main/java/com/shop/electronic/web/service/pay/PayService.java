package com.shop.electronic.web.service.pay;

import com.shop.electronic.payapi.entity.PaymentInfo;

public interface PayService {
	public String pay(PaymentInfo paymentInfo);
}
