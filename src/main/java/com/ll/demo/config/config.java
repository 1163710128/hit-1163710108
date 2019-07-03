package com.ll.demo.config;


import com.ll.demo.pojo.car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    @Bean
    public car getCar(){
        return new car("baoma");
    }
}
