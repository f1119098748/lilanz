package com.demo.lilanzconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class LilanzConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(LilanzConfigApplication.class, args);
    }

}
