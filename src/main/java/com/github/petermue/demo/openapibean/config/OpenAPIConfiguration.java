package com.github.petermue.demo.openapibean.config;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class OpenAPIConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "petermue.openapi")
    public OpenAPI openAPI() {
        return new OpenAPI();
    }
}
