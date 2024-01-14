package com.backend.nasaastronomia.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NasaApiServiceImpl implements NasaApiService {

    @Value("${nasa.api.base-url}")
    private String nasaApiBaseUrl;

    @Value("${nasa.api.api-key}")
    private String nasaApiKey;

    private final RestTemplate restTemplate;

    public NasaApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public String getAstronomyPictureOfTheDay() {
        String apiUrl = nasaApiBaseUrl + "/planetary/apod?api_key=" + nasaApiKey;
        return restTemplate.getForObject(apiUrl, String.class);
    }
}

