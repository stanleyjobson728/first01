package com.springboot;

import com.springboot.model.Customer;
import com.springboot.service.CustomerService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by ghost on 2018/12/7.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerTest {

    @Resource
    CustomerService customerService;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testCustoemrService(){
        Customer byId = customerService.findById(1);
        System.out.println(byId);
        Customer byId1 = customerService.findById(2);
        System.out.println(byId1);
        System.out.println("====================");
        Customer byIdAndIdcard = customerService.findByIdAndIdcard(1, "123");
        System.out.println(byIdAndIdcard);
    }



}
