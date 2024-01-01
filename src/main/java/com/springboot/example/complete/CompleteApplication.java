package com.springboot.example.complete;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.springboot.example.complete.student.StudentController;

@SpringBootApplication
public class CompleteApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompleteApplication.class, args);
	}

}
