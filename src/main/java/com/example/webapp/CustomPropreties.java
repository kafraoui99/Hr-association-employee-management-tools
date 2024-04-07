package com.example.webapp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix="com.exemple.webapp")

public class CustomPropreties {
	String apiUrl;

	public String getApiUrl() {
		// TODO Auto-generated method stub
		return apiUrl;
	}
}
