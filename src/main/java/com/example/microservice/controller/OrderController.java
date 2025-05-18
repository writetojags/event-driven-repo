package com.example.microservice.controller;

import com.example.microservice.service.OrderService;
import org.springframework.web.bind.annotation.*;

/* Jags created  
 * 
 * */
@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/{orderId}")
    public String createOrder(@PathVariable("orderId") String orderId) {
        return orderService.createOrder(orderId);
    }
}