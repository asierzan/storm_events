package com.storm_events.participants;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ParticipantsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParticipantsApplication.class, args);
	}

}
