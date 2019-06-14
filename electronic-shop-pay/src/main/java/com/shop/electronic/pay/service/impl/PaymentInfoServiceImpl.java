package com.shop.electronic.pay.service.impl;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shop.electronic.common.api.BaseApiService;
import com.shop.electronic.common.redis.BaseRedisService;
import com.shop.electronic.common.token.TokenUtils;
import com.shop.electronic.common.utils.PageDataOutput;
import com.shop.electronic.pay.mapper.PaymentInfoMapper;
import com.shop.electronic.pay.service.PaymentInfoService;
import com.shop.electronic.payapi.entity.PaymentInfo;

@RestController
@RequestMapping("/pay")
public class PaymentInfoServiceImpl extends BaseApiService implements PaymentInfoService {
	@Autowired
	private PaymentInfoMapper paymentInfoMapper;
	@Autowired
	private BaseRedisService baseRedisService;
	@Autowired
	private TokenUtils tokenUtils;

	@Override
	public PageDataOutput addPayInfoToken(@RequestBody PaymentInfo paymentInfo) {
//		paymentInfo.setCreated(DateUtils.getTimestamp());
//		paymentInfo.setUpdated(DateUtils.getTimestamp());
		paymentInfoMapper.insert(paymentInfo);
//		Long paymentInfoId = paymentInfo.getId();
		String paymentInfoId = "";
		if (paymentInfoId == null) {
			return new PageDataOutput();//"系统错误,为获取到支付id"
		}
		String token = tokenUtils.getPayToken();
		baseRedisService.setString(token, paymentInfoId + "");
		return new PageDataOutput();
	}

	@Override
	public PageDataOutput getPayInfoToken(@RequestParam("token") String token) {
		if (StringUtils.isEmpty(token)) {
			return new PageDataOutput();//"token不能为空!"
		}
		String payInfoId = baseRedisService.get(token);
		Long newPayInfoId = Long.parseLong(payInfoId);
		PaymentInfo paymentInfo = paymentInfoMapper.selectByPrimaryKey(newPayInfoId);
		return new PageDataOutput();
	}

	@Override
	public PageDataOutput getByOrderIdPayInfo(@RequestParam("orderId")String orderId) {
		PaymentInfo paymentInfo = paymentInfoMapper.selectByPrimaryKey(orderId);
		if(paymentInfo==null){
			return new PageDataOutput();//"未查询到支付信息"
		}
		return new PageDataOutput();
	}

	@Override
	public PageDataOutput updatePayInfo(@RequestBody PaymentInfo paymentInfo) {
		paymentInfoMapper.updateByPrimaryKey(paymentInfo);
		return new PageDataOutput();
	}

}
