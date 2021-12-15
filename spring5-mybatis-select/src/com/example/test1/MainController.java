package com.example.test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.test1.service.SyainService;

public class MainController {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext  context =
			new ClassPathXmlApplicationContext("applicationContext.xml");

		SyainService gdservice = context.getBean(SyainService.class);
		gdservice.getAllSyain();
		gdservice.getOneSyain(2);
		List<Integer> syain = new ArrayList<>(Arrays.asList(1, 3));
		gdservice.getListSyain(syain);
		
		context.close();
	}
}