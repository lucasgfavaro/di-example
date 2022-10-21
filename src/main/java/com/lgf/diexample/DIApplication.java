package com.lgf.diexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DIApplication {

    private static final Logger log = LoggerFactory.getLogger(DIApplication.class);
    static ApplicationContext context;

    public static void main(String[] args) {
        context = SpringApplication.run(DIApplication.class, args);
    }
}
