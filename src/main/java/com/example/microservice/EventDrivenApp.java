package com.example.microservice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class EventDrivenApp  {
	
	/*private final OrderService orderService implements CommandLineRunner;
	public EventDrivenApp(OrderService orderService) {
		this.orderService = orderService;
	}*/
	
    public static void main(String[] args) {
        SpringApplication.run(EventDrivenApp.class, args);
    }

	/*@Override
	public void run(String... args) throws Exception {
		orderService.createOrder("Demo-order-001");
		
	}*/
}