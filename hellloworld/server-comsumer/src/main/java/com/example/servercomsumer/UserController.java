package com.example.servercomsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Administrator
 * @Date: 2018/6/8 10:06
 * @Description:
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/hi")
    public String hi(String name){
        return userService.hiService(name);
    }
}
