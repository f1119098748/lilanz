package com.demo.lilanzorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
@EnableEurekaClient
public class LilanzOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(LilanzOrderApplication.class, args);
    }

}
