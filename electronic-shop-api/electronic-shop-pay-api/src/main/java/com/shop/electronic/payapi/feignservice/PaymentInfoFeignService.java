package com.shop.electronic.payapi.feignservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop.electronic.common.utils.PageDataOutput;
import com.shop.electronic.payapi.entity.PaymentInfo;
import com.shop.electronic.payapi.feignfallback.PaymentInfoServiceFeignFallback;

/**
 * 支付接口
 * 
 * @author Administrator
 *
 */
@FeignClient(value="pay-service",fallback=PaymentInfoServiceFeignFallback.class)
public interface PaymentInfoFeignService {

	/**
	 * 换取支付令牌
	 * 
	 * @return
	 */
	@PostMapping("/addPayInfoToken")
	public PageDataOutput addPayInfoToken(@RequestBody PaymentInfo paymentInfo);

	/**
	 * 使用token查找支付信息
	 * 
	 * @param paymentInfo
	 * @return
	 */
	@GetMapping("/getPayInfoToken")
	public PageDataOutput getPayInfoToken(@RequestParam("token") String token);

	/**
	 * 使用token查找支付信息
	 * 
	 * @param paymentInfo
	 * @return
	 */
	@GetMapping("/getByOrderIdPayInfo")
	public PageDataOutput getByOrderIdPayInfo(@RequestParam("orderId") String orderId);
	
	/**
	 * 使用token查找支付信息
	 * 
	 * @param paymentInfo
	 * @return
	 */
	@PostMapping("/updatePayInfo")
	public PageDataOutput updatePayInfo(@RequestBody PaymentInfo paymentInfo);
}
