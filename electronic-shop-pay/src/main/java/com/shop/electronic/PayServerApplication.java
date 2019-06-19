package com.shop.electronic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.shop.electronic.pay.mapper")
@RestController
public class PayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayServerApplication.class, args);
	}

	@Value("${info.name}")
	String name;

	@RequestMapping(value = "/hi")
	public String hi() {
		return name;
	}

}
