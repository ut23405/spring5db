package com.example.test1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.test1.repository.SyainRepository;

@Service
public class SyainService {
	
	@Autowired
	SyainRepository syainRepository;

//	@Transactional(rollbackFor = Exception.class)
	@Transactional
	public void TransactionTest() {
		syainRepository.update1();
		syainRepository.insert1();
	}
}
