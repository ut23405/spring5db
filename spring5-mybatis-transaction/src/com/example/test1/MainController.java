package com.example.test1;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;

import com.example.test1.service.SyainService;

@Controller
public class MainController {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext  context =
			new ClassPathXmlApplicationContext("applicationContext.xml");
		SyainService gdservice = context.getBean(SyainService.class);
		
		try {
			gdservice.TransactionTest();
		} catch(DuplicateKeyException e) {
		    System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		context.close();
	}
}