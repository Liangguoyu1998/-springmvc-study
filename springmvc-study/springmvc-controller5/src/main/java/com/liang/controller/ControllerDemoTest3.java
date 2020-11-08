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
@RequestMapping("/c3")
public class ControllerDemoTest3 {
    @RequestMapping("/test1")
    public String test1(Model model){
        model.addAttribute("msg","c3 test1");
        return "test";
    }
}
