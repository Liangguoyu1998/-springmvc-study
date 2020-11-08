package com.liang.controller;

import com.liang.pojo.User;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-31 2020/10/31
 */
@RestController
public class UserController2 {
    public String json1(){
        User user = new User(1, "小张", 19);
        return user.toString();
    }
}
