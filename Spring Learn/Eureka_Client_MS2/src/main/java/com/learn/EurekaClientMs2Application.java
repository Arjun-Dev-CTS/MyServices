package com.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientMs2Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientMs2Application.class, args);
	}

}
