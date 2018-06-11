package com.example.dubboproducer.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubboproducer.domain.City;

/**
 * @Auther: Administrator
 * @Date: 2018/6/8 15:03
 * @Description:
 */
@Service(version = "1.0.0")
public class CityDubboServiceImpl implements CityDubboService {

    @Override
    public City findCityByName(String cityName) {
        return new City(1L,2L,"温岭","是我的故乡");
    }
}
