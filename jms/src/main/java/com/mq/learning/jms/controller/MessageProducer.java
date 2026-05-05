package com.mq.learning.jms.controller;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MessageProducer {

    private final JmsTemplate jmsTemplate;

    public MessageProducer(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        jmsTemplate.convertAndSend("demo.queue", message);
        return "Message sent: " + message;
    }
//    @PostMapping("/send")
//    public String sendMessage(String message) {
//        jmsTemplate.convertAndSend("demo.topic", message);
//        return "Message sent: " + message;
//    }
}