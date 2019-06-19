package com.shop.electronic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 
 * @classDesc: 功能描述:(Spring HystrixDashBoard服务监控中心)
 * @author: mengzhijun
 * @createTime: 2019年6月11日 上午10:49:12
 * @version: v1.0
 * @copyright:科技有限公司
 */

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashBoardApplication {

	 public static void main(String[] args) {
		 SpringApplication.run(HystrixDashBoardApplication.class, args);
	}
	
}
