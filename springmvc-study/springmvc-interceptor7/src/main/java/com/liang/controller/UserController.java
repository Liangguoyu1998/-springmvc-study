package com.liang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-11-01 2020/11/1
 */
@Controller
public class UserController {
    @RequestMapping("/main")
    public String main(){
        return "main";
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/toLogin")
    public String toLogin(String username, String password, HttpSession session){
        session.setAttribute("username",null);
        if(username.equals("小明") && password.equals("123456")){
            session.setAttribute("username",username);
        }
        return "redirect:/main";

    }
}
