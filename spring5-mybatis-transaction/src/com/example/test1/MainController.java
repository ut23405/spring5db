package com.example.test1;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext  context =
			new ClassPathXmlApplicationContext("applicationContext.xml");

		GetDataService gdservice = (GetDataService) context.getBean("GetData");
		
		try {
			gdservice.TransactionTest();
		} catch(DuplicateKeyException e) {
		    System.out.println(e.getMessage());
		}
		context.close();
	}
}