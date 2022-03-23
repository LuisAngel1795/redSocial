package com.project.gs.red;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class RedApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedApplication.class, args);
	}

}
