package com.liang.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-30 2020/10/30
 */
@Component(value = "/controllerDemoTest1")
public class ControllerDemoTest1 implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","Hello SpringMVC!");
        modelAndView.setViewName("test");
        return modelAndView;
    }
}
