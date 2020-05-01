package com.demo.lilanzuser.service;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{


    @Override
    public String test() {
        return "user test go !";
    }
}
