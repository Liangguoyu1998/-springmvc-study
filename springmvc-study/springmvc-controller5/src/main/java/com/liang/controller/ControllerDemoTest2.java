package com.liang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-30 2020/10/30
 */
@Controller //代表这个类会被Spring接管
//被这个注解的类，中的所有方法，如果返回值是String，并且有具体页面可以跳转，
// 那么就会被视图解析器解析
public class ControllerDemoTest2 {
    @RequestMapping("/test1")
    public String test1(Model model){
        model.addAttribute("msg","Spring MVC");
        return "test";
    }
    @RequestMapping("/test2")
    public String test2(Model model){
        model.addAttribute("msg","Spring MVC is good!");
        return "test";
    }
}
