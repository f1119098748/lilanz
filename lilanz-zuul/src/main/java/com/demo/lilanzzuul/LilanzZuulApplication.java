package com.demo.lilanzzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class LilanzZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(LilanzZuulApplication.class, args);
    }

}
