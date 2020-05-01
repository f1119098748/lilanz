package com.demo.lilanzorder.clent;

import org.springframework.stereotype.Component;

@Component
public class UserClientFallback implements UserClient {
    @Override
    public String test() {
        return "服务繁忙，请重试！";
    }
}
