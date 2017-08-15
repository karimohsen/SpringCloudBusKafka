package com.orange.springcloudclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringCloudClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudClientApplication.class, args);
	}
}
