package com.example.serviceOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceOneApplication {
	@RequestMapping("/get")
	public String get()
	{
		return "Hello from serviceOne";
	}

	public static void main(String[] args) {
		SpringApplication.run(ServiceOneApplication.class, args);
	}

}
