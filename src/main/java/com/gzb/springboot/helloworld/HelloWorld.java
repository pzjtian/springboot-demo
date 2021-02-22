package com.gzb.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWorld {

    @RequestMapping("/hello")
    String index(){
        return "hello world";
    }

    public static void main(String[] args){
        SpringApplication.run(HelloWorld.class,args);
    }

}
