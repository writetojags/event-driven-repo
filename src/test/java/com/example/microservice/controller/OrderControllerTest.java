package com.example.microservice.controller;

import com.example.microservice.service.OrderService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(OrderController.class)
public class OrderControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private OrderService orderService;

    @Test
    void shouldCreateOrderViaRest() throws Exception {
        Mockito.when(orderService.createOrder("test-789")).thenReturn("Order Created: test-789");

        mockMvc.perform(post("/api/orders/{orderId}",  "test-789"))
                .andExpect(status().isOk())
                .andExpect(content().string("Order Created: test-789"));
    }
}