package com.example.servicefeign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: Administrator
 * @Date: 2018/6/8 10:22
 * @Description:
 */
@FeignClient(value = "service-hi")
public interface ScheduleServiceHi {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name")String name);
}
