package com.example.dubboproducer.dubbo;

import com.example.dubboproducer.domain.City;

/**
 * @Auther: Administrator
 * @Date: 2018/6/8 15:02
 * @Description:
 */
public interface CityDubboService {

    City findCityByName(String name);
}
