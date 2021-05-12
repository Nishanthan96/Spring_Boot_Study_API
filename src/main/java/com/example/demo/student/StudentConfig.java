package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.MAY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {

            Student Nishanthan = new Student(
                    "Nishanthan",
                    "nish@gmail.com",
                    LocalDate.of(1996, MAY,6));

            Student Ahrur = new Student(
                    "Ahrur",
                    "dino@gmail.com",
                    LocalDate.of(1995, MAY,11));

            repository.saveAll(
                    List.of(Nishanthan,Ahrur)
            );
        };
    }

}
