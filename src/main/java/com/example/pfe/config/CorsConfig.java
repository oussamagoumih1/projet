package com.example.pfe.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class CorsConfig {
    @Bean

    public WebMvcConfigurer corsConfigurer() {

        return new WebMvcConfigurer() {

            @Override
            public void addCorsMappings(CorsRegistry registry) {

                registry.addMapping("/**")

                        .allowedMethods("GET", "POST", "PUT", "DELETE")

                        .allowedHeaders("*")

                        .allowedOrigins("http://localhost:4200");

            }

        };

    }
}
