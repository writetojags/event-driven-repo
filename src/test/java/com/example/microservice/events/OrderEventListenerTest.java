package com.example.microservice.events;

import com.example.microservice.EventDrivenApp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.context.ApplicationEventPublisher;

import static org.mockito.Mockito.timeout;
import static org.mockito.Mockito.verify;

@SpringBootTest(classes = EventDrivenApp.class)
public class OrderEventListenerTest {

    @Autowired
    private ApplicationEventPublisher publisher;

    @SpyBean
    private OrderEventListener listener;

    @Test
    void testEventReceivedByListener() {
        OrderCreatedEvent event = new OrderCreatedEvent(this, "unit-test-001");
        publisher.publishEvent(event);

        verify(listener, timeout(1000)).handleOrderCreated(event);
    }
}