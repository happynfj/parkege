package com.example.dubbocomsumer;

import com.example.dubbocomsumer.domain.dubbo.dubbo.CityDubboComsumerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DubboComsumerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DubboComsumerApplication.class, args);
		CityDubboComsumerService cityService = run.getBean(CityDubboComsumerService.class);
		cityService.printCity();
	}
}
