package com.example.test1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.test1.service.SyainService;

public class MainController {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext  context =
			new ClassPathXmlApplicationContext("applicationContext.xml");
		SyainService syainService = context.getBean(SyainService.class);
		syainService.getOneSyain(2);
		syainService.updateSyain();
		context.close();
	}
}