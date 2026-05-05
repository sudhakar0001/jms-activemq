package com.mq.learning.jms.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

//    @JmsListener(destination = "demo.queue")
//    public void receiveMessage(String message) {
//        System.out.println("Received: " + message);
//    }
	
//	 @JmsListener(destination = "demo.topic")
//	    public void receiveMessage(String message) {
//	        System.out.println("Received: " + message);
//	    }
}