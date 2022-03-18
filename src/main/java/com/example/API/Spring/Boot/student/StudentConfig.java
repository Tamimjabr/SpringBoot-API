package com.example.API.Spring.Boot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
          Student tamim = new Student( "Tamim", "tamim.se@hotmail.com", LocalDate.of(1995,8,9));
          Student alex= new Student( "Alex", "alex@example.com", LocalDate.of(2000,12,9));

          repository.saveAll(List.of(tamim,alex));
    };
    }
}
