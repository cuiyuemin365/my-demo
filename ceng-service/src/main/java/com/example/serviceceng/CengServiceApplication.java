package com.example.serviceceng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.serviceceng")
public class CengServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CengServiceApplication.class, args);
    }

}
