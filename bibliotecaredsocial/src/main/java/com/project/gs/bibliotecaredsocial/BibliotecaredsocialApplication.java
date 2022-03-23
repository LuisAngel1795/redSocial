package com.project.gs.bibliotecaredsocial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class BibliotecaredsocialApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaredsocialApplication.class, args);
	}

}
