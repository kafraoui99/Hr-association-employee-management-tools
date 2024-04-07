package com.example.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.webapp.CustomPropreties;

@SpringBootApplication
public class WebappApplication implements CommandLineRunner {

	@Autowired
	private CustomPropreties props;
	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(props.getApiUrl());
		
	}

}