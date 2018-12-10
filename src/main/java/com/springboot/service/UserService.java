package com.springboot.service;

import com.springboot.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ghost on 2018/11/16.
 */
public interface UserService {

    User selectByPrimaryKey(Integer id);

    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);

    List<User> selectByPrimaryKey();
}
