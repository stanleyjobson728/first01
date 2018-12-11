package com.springboot.controller;

import com.springboot.model.User;
import com.springboot.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * demo
 * Created by ghost on 2018/11/16.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;


//    @ResponseBody
//    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
//    public int addUser(User user){
//        return userService.addUser(user);
//    }
//
//    @ResponseBody
//    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
//    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
//
//        return userService.findAllUser(pageNum,pageSize);
//    }


    @RequestMapping("/findById")
    @ResponseBody
    public String findById(Integer id){
        User user = userService.selectByPrimaryKey(id);
        System.out.println(user);
        return user.toString();

    }

    @RequestMapping("/findall")
    @ResponseBody
    public String selectByPrimaryKey(){
        List<User> users = userService.selectByPrimaryKey();
        StringBuilder sb = new StringBuilder();
        for(User user :users){
            sb.append("姓名："+user.getUsername()+"password :"+user.getPassword()+"Phone:"+user.getPhone()+"\r\n");
        }
        System.out.println(sb.toString());
        return sb.toString();

    }



}
