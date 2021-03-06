package com.evergreenprogrammer.microservices.dimensionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient(autoRegister = true)
@SpringBootApplication
public class DimensionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DimensionServiceApplication.class, args);
	}
}
