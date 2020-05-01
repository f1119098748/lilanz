package com.demo.lilanzorder.clent;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "user-server",fallback = UserClientFallback.class)
public interface UserClient {

    @GetMapping("/test")
    public String test();

}
