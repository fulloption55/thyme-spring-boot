package com.example.thymespringboot.config;


import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class MovieApiConfig {

    @Value("${internal.movie-api.endpoints.showtime}")
    private String showtimeEndpoint;

}
