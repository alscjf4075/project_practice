package dev.mvc.project_practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"dev.mvc"})
public class ProjectPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectPracticeApplication.class, args);
    }

}