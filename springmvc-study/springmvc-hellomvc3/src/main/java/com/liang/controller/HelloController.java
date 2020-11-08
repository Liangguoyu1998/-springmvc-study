package com.liang.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-30 2020/10/30
 */
//定义一个Controller
public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //得到视图模型
        ModelAndView mv = new ModelAndView();
        //处理业务
        //存数据
        mv.addObject("msg","Hello World!");
        //设置视图名
        mv.setViewName("hello");
        //返回视图模型
        return mv;
    }
}
