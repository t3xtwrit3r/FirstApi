package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.DECEMBER;
import static java.time.Month.SEPTEMBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
           Student mubin = new Student(
                   "Mubin",
                   "mubin@gmail.com",
                   LocalDate.of(1995, SEPTEMBER, 17)
           );
            Student ASA = new Student(
                    "Asa",
                    "Asa@gmail.com",
                    LocalDate.of(1997, DECEMBER, 21)
            );
            repository.saveAll(List.of(mubin, ASA));
        };
    }

}
