package com.zhangkm.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class AppMicroservice extends WebMvcConfigurerAdapter{
    public static void main(String[] args) {
        SpringApplication.run(AppMicroservice.class, args);
    } 

}
