package com.liang.controller;

import com.liang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-11-01 2020/11/1
 */
@RestController
@RequestMapping("/user")
public class TestInteceptorUserController {
    @RequestMapping("/getUser")
    public String getUser(){
        return new User("小巧",18,"女").toString();
    }
}
