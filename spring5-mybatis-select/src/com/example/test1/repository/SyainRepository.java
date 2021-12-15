package com.example.test1.repository;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.example.test1.SyainEntity;

public interface SyainRepository {
	public List<SyainEntity> findAll();
	public SyainEntity findOne(int id);
	public List<SyainEntity> findList(
			@Param("syain") List<Integer> syain);
}
