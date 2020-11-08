package com.liang.controller;

import com.liang.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-11-01 2020/11/1
 */
@RestController
public class UserController {
    @RequestMapping("/a2")
    public List<User> getUser(){
        List<User> userList = new ArrayList<User>();
        userList.add(new User("小明",5,"男"));
        userList.add(new User("小红",10,"女"));
        userList.add(new User("小张",18,"男"));
        return userList;
    }
}
