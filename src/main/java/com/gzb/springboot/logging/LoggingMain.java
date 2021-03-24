package com.gzb.springboot.logging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.gzb.springboot.jdbc.*")
public class LoggingMain {
    public static void main(String[] args){
        SpringApplication.run(LoggingMain.class,args);
    }
}
