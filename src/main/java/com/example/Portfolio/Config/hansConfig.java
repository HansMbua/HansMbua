package com.example.Portfolio.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class hansConfig {


    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
