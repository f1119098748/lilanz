package com.demo.lilanztest.controller;

import com.demo.lilanztest.util.TestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    TestUtil testUtil;
    @Value("${wx.abc}")
    String abc;

    @ResponseBody
    @GetMapping("/a")
    public String a(){
        System.out.println(abc);
        return "test";
    }


    @ResponseBody
    @GetMapping("/test")
    public String test(){
        return "abc:"+testUtil.getWxabc()+"------=url:"+testUtil.getWxurl()+"-----value:"+testUtil.getWxvalue();
    }

}
