package com.example.thymespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ThymeSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThymeSpringBootApplication.class, args);
    }
}
