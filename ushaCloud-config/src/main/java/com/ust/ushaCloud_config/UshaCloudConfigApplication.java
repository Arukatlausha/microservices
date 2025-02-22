package com.ust.ushaCloud_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class UshaCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(UshaCloudConfigApplication.class, args);
	}

}
