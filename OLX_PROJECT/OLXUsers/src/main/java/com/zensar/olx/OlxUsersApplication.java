package com.zensar.olx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.zensar.olx"})
public class OlxUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlxUsersApplication.class, args);
	}

}
