package com.yyz.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: yyz
 * @Date: 2018/11/20 21:26
 * @Description:springhboot测试
 */
@Controller
public class UserController {
   @Value("${book.name}")
    private String name;
    @Value("${book.pass}")
    private String pass;
    @RequestMapping("test")
    @ResponseBody
    public String test(){
        return "hello world!---"+name+":"+pass;
    }
}
