package com.yyz.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
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
    @Value("${user_name}")
    private String userName;
    @Value("${user_pass}")
    private String userPass;
    @RequestMapping("test")
    @ResponseBody
    public String test(){
        return "hello world!---"+userName+":"+userPass;
    }
}
