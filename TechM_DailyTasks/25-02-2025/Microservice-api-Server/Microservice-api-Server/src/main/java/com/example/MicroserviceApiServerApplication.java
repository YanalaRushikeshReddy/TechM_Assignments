package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class MicroserviceApiServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceApiServerApplication.class, args);
	}

}
