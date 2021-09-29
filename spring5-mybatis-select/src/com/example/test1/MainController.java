package com.example.test1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainController {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext  context =
			new ClassPathXmlApplicationContext("applicationContext.xml");

		GetDataService gdservice = (GetDataService) context.getBean("GetData");
		gdservice.getAllSyain();
		gdservice.getOneSyain(2);
		context.close();
	}
}