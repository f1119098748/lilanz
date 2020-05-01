package com.demo.lilanzuser.controller;
import com.demo.lilanzuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @Autowired
    UserService userService;

    @GetMapping("/test")
    public String user(){
        return userService.test();
    }


}
