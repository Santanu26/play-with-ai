package com.practice.ai.generateprompt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GeneratePromptApplication {

    public static void main(String[] args) {

        SpringApplication.run(GeneratePromptApplication.class, args);
    }

}
