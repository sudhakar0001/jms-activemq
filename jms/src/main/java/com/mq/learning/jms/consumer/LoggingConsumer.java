package com.mq.learning.jms.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class LoggingConsumer {

	@JmsListener(
		    destination = "demo.queue",
		    containerFactory = "jmsListenerContainerFactory",
		    subscription = "logging-sub"
		)
    public void consume(String message) {
        System.out.println("📘 Logging Service received: " + message);
    }
}
