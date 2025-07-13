package com.example.microservice.service;

import com.example.microservice.events.OrderCreatedEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final ApplicationEventPublisher publisher;

    public OrderService(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public String createOrder(String orderId) {
        publisher.publishEvent(new OrderCreatedEvent(this, orderId));
        return "Order Created: " + orderId;
    }
}