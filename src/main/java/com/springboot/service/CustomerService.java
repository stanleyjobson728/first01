package com.springboot.service;

import com.springboot.model.Customer;

/**
 * Created by ghost on 2018/12/7.
 */
public interface CustomerService {


    Customer findById(Integer id);

    Customer findByIdAndIdcard(Integer id,String idcard);

}
