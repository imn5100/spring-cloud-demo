package com.shaw.cloudtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CloudTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudTestApplication.class, args);
    }
}
