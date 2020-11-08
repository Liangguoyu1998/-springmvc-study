package com.liang.controller;

import com.liang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-11-01 2020/11/1
 */
@Controller
public class AjaxController {
    @RequestMapping("/t1")
    public String test1(){
        return "hello";
    }
    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("utf-8");
        boolean flag;
        if("admin".equals(name)){
            flag = true;
        }else{
            flag = false;
        }
        response.getWriter().print(flag);
    }

}
