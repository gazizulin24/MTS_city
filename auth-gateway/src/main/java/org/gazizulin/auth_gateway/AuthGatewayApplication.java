package org.gazizulin.auth_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AuthGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthGatewayApplication.class, args);
	}

}
