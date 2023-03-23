package com.mentorship.vinegatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class VineGatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VineGatewayServiceApplication.class, args);
    }

}
