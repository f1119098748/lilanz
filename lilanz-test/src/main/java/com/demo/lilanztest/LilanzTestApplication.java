package com.demo.lilanztest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@RefreshScope
@SpringBootApplication
public class LilanzTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(LilanzTestApplication.class, args);
    }

}
