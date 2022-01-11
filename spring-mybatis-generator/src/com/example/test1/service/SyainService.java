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
	public void updateSyain() {
		// insert
		Syain syain1 = new Syain();
		syain1.setId(100);
		syain1.setName("テスト");
		syain1.setRomaji("test");
		syainMapper.insert(syain1);
		
		// update
		Syain syain2 = new Syain();
		syain2.setId(2); // update対象のキーを指定
		syain2.setName("変更テスト");
		syainMapper.updateByPrimaryKeySelective(syain2);
	}
}
