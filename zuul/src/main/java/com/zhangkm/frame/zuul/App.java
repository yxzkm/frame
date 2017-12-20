package com.zhangkm.frame.zuul;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableZuulProxy
public class App extends WebMvcConfigurerAdapter{

    private Logger logger = LoggerFactory.getLogger(this.getClass());
            
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    } 

}