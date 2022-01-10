package com.devsuperior.hruser.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

// Um bean é responsavel por permitir que o spring consiga injetar uma classe
@Configuration
public class AppConfig {
	
	// @Bean indica que é um componente injetavel
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
