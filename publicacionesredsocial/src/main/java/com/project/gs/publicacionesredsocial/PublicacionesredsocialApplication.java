package com.project.gs.publicacionesredsocial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PublicacionesredsocialApplication {

	public static void main(String[] args) {
		SpringApplication.run(PublicacionesredsocialApplication.class, args);
	}

}
