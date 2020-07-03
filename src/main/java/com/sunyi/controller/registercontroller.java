package com.sunyi.controller;

import com.sunyi.mapper.UserMapper;
import com.sunyi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class registercontroller {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/register")
    public String register(){
        return "register";
    }
    @RequestMapping("/adduser")
    public String adduser(HttpServletRequest request, Map<String,Object> map){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        System.out.println(user);

       userMapper.addnew(username, password);
        User user1 = userMapper.getuser(username);
        System.out.println(user);


        return "register";

    }
    @RequestMapping("/getuser")
    public String getuser(HttpServletRequest request){
        String username = request.getParameter("username");
        User user = userMapper.getuser(username);
        System.out.println(user);
        return "register";
    }
    @RequestMapping("/deleteuser")
    public String deleteuser(HttpServletRequest request){
        String username = request.getParameter("username");
        userMapper.deleteuser(username);

        return "register";
    }

    @RequestMapping("/updateuser")
    public String updateuser(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        userMapper.updateuser(username,password);
        return "register";
    }
}
