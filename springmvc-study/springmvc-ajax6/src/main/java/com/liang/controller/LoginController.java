package com.liang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-11-01 2020/11/1
 */
@RestController
public class LoginController {
    @RequestMapping("/login")
    public String login(String username,String password){
        if(username==null || username.trim().equals("")){
            return "用户名不能为空";
        }
        if(password==null || password.trim().equals("")){
            return "密码不能为空";
        }
        if(!username.equals("admin")){
            return "用户名错误";
        }else if(!password.equals("123456")){
            return "密码错误";
        }
        return "success";
    }
}
