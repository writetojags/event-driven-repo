package com.example.microservice.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationEventPublisher;

import com.example.microservice.EventDrivenApp;
@SpringBootTest(classes = EventDrivenApp.class)
public class OrderServiceTest {

    @Test
    void testCreateOrder() {
        ApplicationEventPublisher publisher = mock(ApplicationEventPublisher.class);
        OrderService service = new OrderService(publisher);
        String result = service.createOrder("12345");
        assertTrue(result.contains("Order Created"));
    }
}