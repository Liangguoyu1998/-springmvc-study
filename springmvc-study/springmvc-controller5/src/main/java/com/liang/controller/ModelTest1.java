package com.liang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-31 2020/10/31
 */
@Controller
public class ModelTest1 {
    @RequestMapping("/m1/t1")
    public String test(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        System.out.println(session.getId());
        return "test";
    }
    @RequestMapping("/m1/t2")
    public String test2(Model model){
        model.addAttribute("msg","你好！");
        //将视图解析器注掉，请求转发
        return "forward:/WEB-INF/jsp/test.jsp";
    }
    @RequestMapping("/m1/t3")
    public String test3(Model model,HttpSession session){
        //重定向用Model存数据，传不过去，只能用HttpSession
        //model.addAttribute("msg","你的名字是什么？");
        session.setAttribute("msg","你的名字是什么？");
        return "redirect:/index.jsp";
    }
}
