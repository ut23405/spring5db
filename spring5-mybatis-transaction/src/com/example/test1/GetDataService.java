package com.example.test1;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GetDataService {
	private final SyainRepository sr1;

	public GetDataService(SyainRepository sr1) {
		this.sr1 = sr1;
	}

//	@Transactional(rollbackFor = Exception.class)
	@Transactional
	public void TransactionTest() {
		sr1.update1();
		sr1.insert1();
	}
}
