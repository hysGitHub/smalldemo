package com.hys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignRestemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignRestemplateApplication.class, args);
	}
}
