package com.springboot.controller;

/**
 * Created by ghost on 2018/12/10.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guest")
public class GuestController {

//    @Autowired
//    private final ResultMap resultMap;
//
//    @RequestMapping(value = "/enter", method = RequestMethod.GET)
//    public ResultMap login() {
//        return resultMap.success().message("欢迎进入，您的身份是游客");
//    }
//
//    @RequestMapping(value = "/getMessage", method = RequestMethod.GET)
//    public ResultMap submitLogin() {
//        return resultMap.success().message("您拥有获得该接口的信息的权限！");
//    }
}