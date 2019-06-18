package com.shop.electronic.payapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class PayApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(PayApiApplication.class, args);
	}
}
