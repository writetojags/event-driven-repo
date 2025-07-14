package com.example.microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
	//Health check
	@GetMapping("/health")
	public String health() {
		return "OK";
		
	}

}
