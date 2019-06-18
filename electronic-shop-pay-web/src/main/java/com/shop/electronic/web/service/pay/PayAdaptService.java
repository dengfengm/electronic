package com.shop.electronic.web.service.pay;

import com.shop.electronic.payapi.entity.PaymentInfo;
import com.shop.electronic.payapi.entity.PaymentType;

public interface PayAdaptService {
	public String pay(PaymentInfo paymentInfo,PaymentType paymentType );
}
