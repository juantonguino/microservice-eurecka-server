package com.codeandapps.microservice.eurecka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceEureckaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceEureckaServerApplication.class, args);
	}

}
