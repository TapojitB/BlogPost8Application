package com.evergreenprogrammer.microservices.shapeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient(autoRegister = true)
@EnableFeignClients(basePackages = "com.evergreenprogrammer.microservices.shapeservice.proxy")
@SpringBootApplication
public class ShapeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShapeServiceApplication.class, args);
	}

}
