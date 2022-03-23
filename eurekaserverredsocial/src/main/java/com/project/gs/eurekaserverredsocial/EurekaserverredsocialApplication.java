package com.project.gs.eurekaserverredsocial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaserverredsocialApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaserverredsocialApplication.class, args);
	}

}
