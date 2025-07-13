package com.example.microservice.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class OrderEventListener {

    private static final Logger logger = LoggerFactory.getLogger(OrderEventListener.class);

    @EventListener
    public void handleOrderCreated(OrderCreatedEvent event) {
        logger.info("Handling event for Order ID: {}", event.getOrderId());
    }
}