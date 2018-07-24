package com.event.eventapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.evento.controller","com.evento.dao","com.evento.model","com.evento.servicio","com.evento.util"})
@EntityScan("com.evento.model") 
@EnableJpaRepositories(basePackages = {"com.evento.dao"})
public class EventappApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventappApplication.class, args);
	}
}
