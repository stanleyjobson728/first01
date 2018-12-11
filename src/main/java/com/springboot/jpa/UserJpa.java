package com.springboot.jpa;

import com.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by ghost on 2018/12/10.
 */
public interface UserJpa extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {


    public User findByUsername(String username);

}
