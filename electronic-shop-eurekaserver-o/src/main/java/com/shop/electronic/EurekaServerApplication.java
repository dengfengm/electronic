
package com.shop.electronic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @classDesc: 功能描述:(Spring Cloud服务注册中心)
 * @author: mengzhijun
 * @createTime: 2019年6月11日 上午10:49:12
 * @version: v1.0
 * @copyright:科技有限公司
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
	public static void main(String[] args) {
       SpringApplication.run(EurekaServerApplication.class, args);
	}
}
