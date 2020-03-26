package com.damin.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class DemoSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringApplication.class, args);
    }

}
