package com.ust.Platformss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PlatformssApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlatformssApplication.class, args);
	}

}
