package com.erkan.SpringWebService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.erkan.SpringWebService"})
public class SpringBootWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebServiceApplication.class, args);
	}
}
