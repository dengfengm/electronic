package com.shop.electronic.payapi.feignservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop.electronic.common.utils.PageDataOutput;
import com.shop.electronic.payapi.feignfallback.PaymentTypeServiceFeignFallback;

@FeignClient(value="pay-service",fallback=PaymentTypeServiceFeignFallback.class)
public interface PaymentTypeFeignService {
	
	@GetMapping("/paytype/getPaymentType")
	public PageDataOutput getPaymentType(@RequestParam("paymentTypeId") String paymentTypeId);

}
