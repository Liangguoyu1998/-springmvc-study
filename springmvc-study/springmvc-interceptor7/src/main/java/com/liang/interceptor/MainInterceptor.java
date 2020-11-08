package com.liang.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-11-01 2020/11/1
 */
//拦截器
public class MainInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //如果session里面有username,即表示已登录过，那就放行
        if(request.getSession().getAttribute("username") != null){
            return true;
        }else{//session里面没有username,表示没有登录，那就转发到登录页面
            request.getRequestDispatcher("/login").forward(request,response);
            return false;
        }
    }
}
