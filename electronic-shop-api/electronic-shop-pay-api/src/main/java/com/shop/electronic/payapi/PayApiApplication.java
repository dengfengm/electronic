package com.shop.electronic.payapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableFeignClients("com.shop.electronic.payapi.service")
@EnableHystrix
public class PayApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(PayApiApplication.class, args);
	}
}
