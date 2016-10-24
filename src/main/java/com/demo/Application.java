package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zs on 16/10/20.
 */
@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home(){
        return "hello world!";
    }

    public static void main(String args[]){
        SpringApplication.run(Application.class, args);
    }
}
