package com.ninos.config.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI().info(new Info().title("User Management")
                .description("Microservice to manage a security")
                .contact(new Contact().name("Ninoos Moshi")
                        .email("nalkaton@gmail.com")));
    }


}
