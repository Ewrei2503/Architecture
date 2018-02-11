package com.mycompany.architecture.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

    @Configuration 
    @ComponentScan(basePackages = "com.mycompany.whooper") 
    @EnableWebMvc
public class AppConfig {
}
