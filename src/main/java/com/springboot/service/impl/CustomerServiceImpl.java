package com.springboot.service.impl;

import com.springboot.jpa.CustomerJpa;
import com.springboot.model.Customer;
import com.springboot.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by ghost on 2018/12/7.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private CustomerJpa customerJpa;

    public Customer findById(Integer id) {
        Customer byId = customerJpa.findById(id);
        return byId;
    }

    @Override
    public Customer findByIdAndIdcard(Integer id, String idcard) {
        Customer byIdAndIdcard = customerJpa.findByIdAndIdcard(id, idcard);
        return byIdAndIdcard;
    }


}
