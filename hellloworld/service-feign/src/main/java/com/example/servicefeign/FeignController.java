package com.example.servicefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Administrator
 * @Date: 2018/6/8 10:25
 * @Description:
 */
@RestController
public class FeignController {

    @Autowired
    ScheduleServiceHi scheduleServiceHi;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(String name){
        return scheduleServiceHi.sayHiFromClientOne(name);
    }
}
