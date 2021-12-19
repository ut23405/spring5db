package com.example.test1.repository;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.example.test1.SyainEntity;

public interface SyainRepository {
	List<SyainEntity> findAll();
	SyainEntity findOne(int id);
	List<SyainEntity> findList(
			@Param("syain") List<Integer> syain);
}
