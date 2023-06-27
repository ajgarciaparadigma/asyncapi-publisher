package com.paradigma.poc.asyncapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

@SpringBootApplication
public class Application {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	private List<String> peopleToGreeting = Arrays.asList("Bob", "Alice", "Charlie");

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public Supplier<String> consumeGreetings() {
		return () -> {
			logger.info("Sending...");
			Collections.shuffle(peopleToGreeting);
			return peopleToGreeting.get(0);
		};
	}

	@Bean
	public Consumer<String> comParadigmaEventHelloConsumer() {
		return data -> {
			// Add business logic here.	
			logger.info(data.toString());
		};
	}

}
