package com.aitsl.namingserver.netflixeurekanamigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetflixEurekaNamigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEurekaNamigServerApplication.class, args);
	}

}
