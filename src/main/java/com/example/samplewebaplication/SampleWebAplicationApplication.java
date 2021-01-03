package com.example.samplewebaplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
public class SampleWebAplicationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleWebAplicationApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ApplicationContext applicationContext){
        return args -> {
            System.out.println("let's inspect the bean");
        String[] BeanNames = applicationContext.getBeanDefinitionNames();
            Arrays.sort(BeanNames);
            for(String BeanName : BeanNames){
                System.out.println(BeanName);
            }
        };
    }
}
