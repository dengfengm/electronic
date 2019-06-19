package com.shop.electronic.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 
 * @classDesc: 功能描述:(Spring Zuul网关配置中心)
 * @author: mengzhijun
 * @createTime: 2019年6月11日 上午10:49:12
 * @version: v1.0
 * @copyright:科技有限公司
 */

@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}
}
