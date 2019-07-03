package com.ll.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class Mvcconfig extends WebMvcConfigurerAdapter {
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        // super.addViewControllers(registry);
//        registry.addViewController("/").setViewName("person");
//        registry.addViewController("/index.html").setViewName("person");
//    }
}
