package com.zhangkm.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class AppAuth extends WebMvcConfigurerAdapter{
    public static void main(String[] args) {
        SpringApplication.run(AppAuth.class, args);
    } 

}
