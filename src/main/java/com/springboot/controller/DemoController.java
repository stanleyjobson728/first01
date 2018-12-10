package com.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ghost on 2018/11/13.
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/welcome")
    @ResponseBody
    public String helloSpringBoot(String username) {
        return "Welcome!" + username;
    }


}
