package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;
import static java.time.Month.MARCH;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    1L,
                    "Mariam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(2000, JANUARY, 5),
                    21
            );

            Student alex = new Student(
                    2L,
                    "Alex",
                    "alex.smith@gmail.com",
                    LocalDate.of(2004, MARCH, 21),
                    17
            );

            repository.saveAll(
                    List.of(mariam, alex)
            );
        };
    }

}
