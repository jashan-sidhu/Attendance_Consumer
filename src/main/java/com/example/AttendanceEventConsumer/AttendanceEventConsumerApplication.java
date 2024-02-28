package com.example.AttendanceEventConsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class AttendanceEventConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AttendanceEventConsumerApplication.class, args);
	}

}
