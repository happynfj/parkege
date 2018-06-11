package com.example.dubbocomsumer.domain.dubbo.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubbocomsumer.domain.City;
import com.example.dubbocomsumer.domain.dubbo.CityDubboService;
import org.springframework.stereotype.Component;

/**
 * @Auther: Administrator
 * @Date: 2018/6/8 15:21
 * @Description:
 */
@Component
public class CityDubboComsumerService  {

    @Reference(version = "1.0.0")
    CityDubboService cityDubboService;

    public void printCity() {
        String cityName="温岭";
        System.out.println(cityDubboService+"===================");
        City city = cityDubboService.findCityByName(cityName);
        System.out.println(city.toString());
    }
}
