package com.example.test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainController {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext  context =
			new ClassPathXmlApplicationContext("applicationContext.xml");

		GetDataService gdservice = (GetDataService) context.getBean("GetData");
		gdservice.getAllSyain();
		gdservice.getOneSyain(2);
		List<Integer> syain = new ArrayList<>(Arrays.asList(1, 3));
		gdservice.getListSyain(syain);
		
		context.close();
	}
}