package com.liang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-30 2020/10/30
 */
@Controller
public class HelloController {
    @RequestMapping("/helloController")
    public String hello(Model model){
        //封装数据
        model.addAttribute("msg","Hello SpringMVC");
        return "hello";
    }
}
