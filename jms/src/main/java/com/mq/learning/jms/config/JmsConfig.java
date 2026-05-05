package com.mq.learning.jms.config;

import jakarta.jms.ConnectionFactory;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;

@Configuration
public class JmsConfig {

//	@Bean
//	public DefaultJmsListenerContainerFactory jmsListenerContainerFactory(
//	        ConnectionFactory connectionFactory) {
//
//	    DefaultJmsListenerContainerFactory factory =
//	            new DefaultJmsListenerContainerFactory();
//
//	    factory.setConnectionFactory(connectionFactory);
//	    factory.setPubSubDomain(true); // Topic
//
//	    return factory;
//	}
	
	 @Bean
	    public ActiveMQConnectionFactory activeMQConnectionFactory() {
	        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
	        connectionFactory.setBrokerURL("tcp://localhost:61616");
	        return connectionFactory;
	    }
	    @Bean
	    public JmsTemplate jmsTemplate(ActiveMQConnectionFactory connectionFactory) {
	        return new JmsTemplate(connectionFactory);
	    }
}