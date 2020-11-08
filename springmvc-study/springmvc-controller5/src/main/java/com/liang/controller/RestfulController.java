package com.liang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-30 2020/10/30
 */
@Controller
@RequestMapping("/restful")
public class RestfulController {
    @RequestMapping(value = "/test1/{a1}/{b1}",method = RequestMethod.POST)
    public String test1(@PathVariable("a1") int a, @PathVariable("b1") int b, Model model){
        int result = a + b;
        model.addAttribute("msg",result);
        return "test";
    }
    @RequestMapping(value = "/test1/{a1}/{b1}",method = RequestMethod.GET)
    public String test2(@PathVariable("a1") int a, @PathVariable("b1") int b, Model model){
        int result = a + b;
        model.addAttribute("msg",result);
        return "test";
    }
}
