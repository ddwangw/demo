package com.learn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceProvideClient {
	public static void main(String[] args) {
		//1,单服务提供者启动方式
		SpringApplication.run(ServiceProvideClient.class, args);
	}
}
