package com.fedex.oneclick.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessageProducerController {
	
	@Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        jmsTemplate.convertAndSend("demo.queue", message);
        return "Message sent: " + message;
    }


}
