package com.springboot.controller;

/**
 * Created by ghost on 2018/12/7.
 */

import com.springboot.model.Customer;
import com.springboot.service.CustomerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Resource
    CustomerService customerService;

    @RequestMapping("/findById")
    @ResponseBody
    public String findById(Integer customerId) {

        Customer byId = customerService.findById(customerId);
        return byId.toString();
    }

}

