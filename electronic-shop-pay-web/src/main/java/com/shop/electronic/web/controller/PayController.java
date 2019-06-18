package com.shop.electronic.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.electronic.payapi.entity.PaymentInfo;
import com.shop.electronic.web.base.controller.BaseController;
import com.shop.electronic.web.service.pay.impl.PayImplService;

@Controller
public class PayController   extends BaseController {
//	@Autowired
//	private PaymentInfoFeignService paymentInfoFeignService;
	private static final String PAYGATEWAY = "payGateway";
	@Autowired
	private PayImplService payService;

	@RequestMapping("/payGateway")
	public void payGateway(HttpServletRequest request, String token,HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html;charset=utf-8");
//		PageDataOutput output = paymentInfoFeignService.getPayInfoToken(token);
//		Map<String, Object> resultMap = new HashMap<String, Object>() ;
		PrintWriter out=resp.getWriter();
//		if (resultMap == null) {
//			resp.getWriter().write("系统错误!");
//			 return ;
//		}
//		String json = new JSONObject().toJSONString(output.getData().get(0));
//		PaymentInfo paymentInfo = new JSONObject().parseObject(json, PaymentInfo.class);
		PaymentInfo paymentInfo = new PaymentInfo();
		paymentInfo.setOrderId("1");
		paymentInfo.setPaymentInfoId("1234");
		paymentInfo.setPlatformorderId("12345");
		paymentInfo.setPrice("123");
		paymentInfo.setState(0);
		paymentInfo.setTypeId("1");
		paymentInfo.setSource("123456");
		String html = payService.pay(paymentInfo);
		out.println(html);
		out.close();
	}

}
