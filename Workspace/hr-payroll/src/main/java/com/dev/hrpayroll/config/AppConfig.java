package com.dev.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

	// registra um componente singleton para ser iniciado em outros servicos
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
