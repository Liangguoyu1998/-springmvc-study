package com.liang.controller;

import com.liang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-31 2020/10/31
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/t1")
    public String test1(@RequestParam("name") String name, Model model){
        System.out.println("name="+name);
        model.addAttribute("msg",name);
        return "test";
    }
    @PostMapping("/t1")
    public String test2(@RequestParam("name") String name,Model model){
        System.out.println("name="+name);
        model.addAttribute("msg",name);
        return "test";
    }
    @GetMapping("/t3")
    public String test3(User user,Model model){
        System.out.println(user);
        model.addAttribute("msg",user);
        return "test";
    }
}
