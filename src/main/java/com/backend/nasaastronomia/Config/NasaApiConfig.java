package com.backend.nasaastronomia.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;


@Configuration
public class NasaApiConfig {

    @Value("${nasa.api.base-url}")
    private String nasaApiBaseUrl;

    @Value("${nasa.api.api-key}")
    private String nasaApiKey;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
