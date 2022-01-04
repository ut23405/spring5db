package com.example.test1.service;

import org.springframework.stereotype.Service;
import com.example.test1.Syain;
import com.example.test1.repository.SyainMapper;

@Service
public class SyainService {

    private final SyainMapper syainMapper;

    public SyainService(SyainMapper syainMapper) {
        this.syainMapper = syainMapper;
	}
	public void getOneSyain(int num) {
		Syain s1 = syainMapper.selectByPrimaryKey(num);
		System.out.println(s1.getId() + s1.getName() + s1.getRomaji());
	}
}
