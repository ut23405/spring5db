package com.example.test1;

import java.util.List;

public class GetDataService {
	private final SyainRepository sr1;
	public GetDataService(SyainRepository sr1) {
		this.sr1 = sr1;
	}

	public void getAllSyain() {
		List<SyainEntity> list1 = sr1.findAll();
		for (SyainEntity s1 : list1) {
			System.out.println(s1.getId() + s1.getName() + s1.getRomaji());
		}
	}
	public void getOneSyain(int num1) {
		SyainEntity s2 = sr1.findOne(num1);
		System.out.println("ID：" + num1 + s2.getName());
	}
	public void getListSyain(List<Integer> syain) {
		List<SyainEntity> list2 = sr1.findList(syain);
		for (SyainEntity s2 : list2) {
			System.out.println(s2.getId() + s2.getName() + s2.getRomaji());
		}
	}
}
