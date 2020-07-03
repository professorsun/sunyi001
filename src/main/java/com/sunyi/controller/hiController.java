package com.sunyi.controller;

import com.sunyi.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hiController {
    @RequestMapping("/hi")
    public User hi(){
        User u1=new User();
        u1.setUsername("sunyi");
        u1.setPassword("123456");
        u1.setToken("11111");
        return u1;
    }
}
