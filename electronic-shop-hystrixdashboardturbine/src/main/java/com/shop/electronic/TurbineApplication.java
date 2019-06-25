package com.shop.electronic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 
 * @classDesc: 功能描述:(Spring HystrixDashBoard服务监控中心)
 * @author: mengzhijun
 * @createTime: 2019年6月11日 上午10:49:12
 * @version: v1.0
 * @copyright:科技有限公司
 */

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker //监控来自Feign内部断路器的监控数据
@EnableHystrixDashboard
@EnableTurbine
public class TurbineApplication {

	 public static void main(String[] args) {
		 SpringApplication.run(TurbineApplication.class, args);
	}
	
}
