package com.banking_solution.casa.module;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
public class CasaModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CasaModuleApplication.class, args);
	}

}
