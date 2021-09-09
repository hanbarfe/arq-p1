package com.arq.microservice.capivara;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CapivaraApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapivaraApplication.class, args);
	}

}
