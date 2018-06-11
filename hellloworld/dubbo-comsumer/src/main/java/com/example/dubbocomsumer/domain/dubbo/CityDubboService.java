package com.example.dubbocomsumer.domain.dubbo;

import com.example.dubbocomsumer.domain.City;

/**
 * @Auther: Administrator
 * @Date: 2018/6/8 15:21
 * @Description:
 */
public interface CityDubboService {
    City findCityByName(String cityName);
}
