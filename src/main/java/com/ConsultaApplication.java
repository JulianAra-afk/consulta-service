package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.rancho_smart")
public class ConsultaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsultaApplication.class, args);
	}

}
