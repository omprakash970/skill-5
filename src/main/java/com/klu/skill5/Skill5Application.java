package com.klu.skill5;

import com.klu.skill5.Service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Skill5Application {

    public static void main(String[] args) {
        SpringApplication.run(Skill5Application.class, args);
    }

    @Bean
    CommandLineRunner run(StudentService service) {
        return args -> service.showStudent();
    }
}
