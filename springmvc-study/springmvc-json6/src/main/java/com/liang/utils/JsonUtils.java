package com.liang.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-31 2020/10/31
 */
public class JsonUtils {
    public static String getJson(Object obj) throws JsonProcessingException {
        return getJson(obj,"yyyy:MM:dd HH:mm:ss");
    }
    public static String getJson(Object obj,String dateformat) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        //不是用时间戳的方式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
        //自定义日期的格式
        SimpleDateFormat sdf = new SimpleDateFormat(dateformat);
        mapper.setDateFormat(sdf);
        return mapper.writeValueAsString(obj);
    }
}
