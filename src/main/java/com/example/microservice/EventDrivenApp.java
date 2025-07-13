package com.example.microservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.microservice.service.OrderService;

@SpringBootApplication
public class EventDrivenApp implements CommandLineRunner {
	
	private final OrderService orderService;
	public EventDrivenApp(OrderService orderService) {
		this.orderService = orderService;
	}
	
    public static void main(String[] args) {
        SpringApplication.run(EventDrivenApp.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		orderService.createOrder("Demo-order-001");
		
	}
}