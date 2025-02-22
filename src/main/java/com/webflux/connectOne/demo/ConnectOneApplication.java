package com.webflux.connectOne.demo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@OpenAPIDefinition(info = @Info(title = "connectOne", version = "1.0", description = "Documentation connectOne v1.0"))
public class ConnectOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConnectOneApplication.class, args);
	}

}
