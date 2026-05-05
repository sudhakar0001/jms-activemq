package com.mq.learning.jms.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class AnalyticsConsumer {

	@JmsListener(
		    destination = "demo.queue",
		    containerFactory = "jmsListenerContainerFactory",
		    subscription = "analytics-sub"
		)
    public void consume(String message) {
        System.out.println("📊 Analytics Service received: " + message);
    }
}
