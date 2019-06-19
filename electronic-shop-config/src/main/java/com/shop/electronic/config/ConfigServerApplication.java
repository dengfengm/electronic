package com.shop.electronic.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 
 * @classDesc: 功能描述:(Spring Config配置中心)
 * @author: mengzhijun
 * @createTime: 2019年6月11日 上午10:49:12
 * @version: v1.0
 * @copyright:科技有限公司
 */

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
