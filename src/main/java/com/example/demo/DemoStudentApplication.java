 package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@Configuration
public class DemoStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoStudentApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate retRestTemplate() {
		return new RestTemplate();
		
	}

}
