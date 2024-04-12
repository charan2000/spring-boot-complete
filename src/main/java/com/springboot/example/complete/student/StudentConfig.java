package com.springboot.example.complete.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {

        return args -> {
            Student charan = new Student("Charan", "charan@mail.com", LocalDate.of(2000, Month.SEPTEMBER, 21), 23);
            Student baran = new Student("Baran", "baran@mail.com", LocalDate.of(2001, Month.JULY, 15), 22);

            repository.saveAll(List.of(charan, baran));
        };

    }

}
