package com.springboot.jpa;

import com.springboot.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by ghost on 2018/12/7.
 */
public interface CustomerJpa extends JpaRepository<Customer, Integer>, JpaSpecificationExecutor<Customer> {


    Customer findById(Integer id);

    Customer findByIdAndIdcard(Integer id ,String idcard);
}
