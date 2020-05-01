package com.demo.lilanzorder.controller;

import com.demo.lilanzorder.clent.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {
    @Autowired
    private UserClient userClient;

    @ResponseBody
    @GetMapping("/test")
    public  String test(){
        return userClient.test();
    }


}
