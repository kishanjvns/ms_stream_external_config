package com.tech.kj.SpringBoot_Config_Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringBootConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConfigServerApplication.class, args);
	}

}
