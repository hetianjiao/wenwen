package com.wenwen.exam.dao;

import org.springframework.stereotype.Repository;

import com.wenwen.exam.model.UserDO;

@Repository
public interface UserMapper {
	int deleteByPrimaryKey(Long id);

	int insert(UserDO record);

	int insertSelective(UserDO record);

	UserDO selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(UserDO record);

	int updateByPrimaryKey(UserDO record);
}