package com.liang.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.liang.pojo.User;
import com.liang.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-31 2020/10/31
 */
@Controller
public class UserController {
    //可以在@Request里面加produces = "application/json;charset=utf-8"解决json字符串乱码问题
    //@RequestMapping(value = "/j1",produces = "application/json;charset=utf-8")
    //也可以不是用上面的这种方式解决json字符串乱码问题,可以在springmvc-servlet.xml中进行配置，配置如下：
/*
<mvc:annotation-driven>
        <mvc:message-converters register-defaults="true">
            <bean class="org.springframework.http.converter.StringHttpMessageConverter">
                <constructor-arg value="UTF-8"/>
            </bean>
            <bean class="org.springframework.http.converter.json.MappingJackson2HttpMessageConverter">
                <property name="objectMapper">
                    <bean class="org.springframework.http.converter.json.Jackson2ObjectMapperFactoryBean">
                        <property name="failOnEmptyBeans" value="false"/>
                    </bean>
                </property>
            </bean>
        </mvc:message-converters>
 </mvc:annotation-driven>
 */
    @RequestMapping("/j1")
    @ResponseBody //它不会走视图解析器，会直接返回一个字符串
    public String json1() throws JsonProcessingException {
        //创建一个对象
        User user = new User(2,"小明",18);
        //jackson, ObjectMapper
        //ObjectMapper mapper = new ObjectMapper();
        //String s = mapper.writeValueAsString(user);
        //return s;
        return JsonUtils.getJson(user);
    }
    @RequestMapping("/j2")
    @ResponseBody
    public String json2() throws JsonProcessingException {
        //ObjectMapper objectMapper = new ObjectMapper();
        User user1 = new User(1, "小李1", 15);
        User user2 = new User(2, "小李2", 15);
        User user3 = new User(3, "小李3", 15);
        User user4 = new User(4, "小李4", 15);
        List<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        //String s = objectMapper.writeValueAsString(userList);
        //return s;
        return JsonUtils.getJson(userList);
    }
    @RequestMapping("/j3")
    @ResponseBody
    public String json3() throws JsonProcessingException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
//        Date date = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        objectMapper.setDateFormat(sdf);
//        String format = sdf.format(date);
//        System.out.println(format);
//        return objectMapper.writeValueAsString(date);
        //ObjectMapper,时间解析后的默认格式为：Timestamp(时间戳）
        //return new ObjectMapper().writeValueAsString(format);
        return JsonUtils.getJson(new Date(),"yyyy:MM:dd HH:mm:ss");
    }
}
