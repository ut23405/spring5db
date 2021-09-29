package com.example.test1;

import java.util.List;

public class GetDataService {
	private final SyainRepository sr1;
	public GetDataService(SyainRepository sr1) {
		this.sr1 = sr1;
	}

	public void getAllSyain() {
		List<SyainEntity> list = sr1.findAll();
		for (SyainEntity s1 : list) {
			System.out.println(s1.getId() + s1.getName() + s1.getRomaji());
		}
	}
	public void getOneSyain(int num1) {
		SyainEntity s2 = sr1.findOne(num1);
		System.out.println("ID：" + num1 + s2.getName());
	}
}
