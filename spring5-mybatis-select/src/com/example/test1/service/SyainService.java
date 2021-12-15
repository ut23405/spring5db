package com.example.test1.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test1.SyainEntity;
import com.example.test1.repository.SyainRepository;

@Service
public class SyainService {
	@Autowired
	SyainRepository syainRepository;

	public void getAllSyain() {
		List<SyainEntity> list1 = syainRepository.findAll();
		for (SyainEntity s1 : list1) {
			System.out.println(s1.getId() + s1.getName() + s1.getRomaji());
		}
	}
	public void getOneSyain(int num1) {
		SyainEntity s2 = syainRepository.findOne(num1);
		System.out.println("ID：" + num1 + s2.getName());
	}
	public void getListSyain(List<Integer> syain) {
		List<SyainEntity> list2 = syainRepository.findList(syain);
		for (SyainEntity s2 : list2) {
			System.out.println(s2.getId() + s2.getName() + s2.getRomaji());
		}
	}
}
