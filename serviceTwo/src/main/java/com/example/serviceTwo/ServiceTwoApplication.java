package com.example.serviceTwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceTwoApplication {
	@RequestMapping("/get")
	public String get()
	{
		return "Hello from serviceTwo";
	}

	public static void main(String[] args) {
		SpringApplication.run(ServiceTwoApplication.class, args);
	}

}
