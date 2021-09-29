package com.example.test1;

import java.util.List;

public interface SyainRepository {
	public List<SyainEntity> findAll();
	public SyainEntity findOne(int id);
}
