package com.backbase.backendtechnicaltest.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

import java.net.URI;

@ConfigurationProperties(prefix="transaction")
@Configuration
public class TransactionConfiguration {
    private String baseUrl;
    private URI uri;

    public URI getUri() {
        return uri;
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Bean
    public WebClient webClient() {
        return WebClient.create();
    }
}
