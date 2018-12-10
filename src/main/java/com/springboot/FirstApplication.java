package com.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
//@SpringBootApplication(scanBasePackages = "com.springboot")
//@EnableAutoConfiguration
//@ComponentScan(basePackages = {"com.springboot.*"})
@MapperScan("com.springboot.mapper")
@SpringBootApplication
//@ComponentScan(basePackages="com.springboot.*")
public class FirstApplication {


    @RequestMapping("/")
    String index() {
        return "Hello Spring Boot";
    }


    public static void main(String[] args) {
        SpringApplication.run(FirstApplication.class, args);
    }
}
