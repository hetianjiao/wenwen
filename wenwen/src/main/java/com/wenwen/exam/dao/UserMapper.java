package com.wenwen.exam.dao;

import org.springframework.stereotype.Repository;

import com.wenwen.exam.model.User;

@Repository
public interface UserMapper {
	int deleteByPrimaryKey(Long id);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
}