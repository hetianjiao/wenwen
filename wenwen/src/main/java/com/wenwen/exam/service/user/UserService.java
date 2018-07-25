package com.wenwen.exam.service.user;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wenwen.exam.dao.UserMapper;
import com.wenwen.exam.model.UserDO;

@Service
public class UserService {
	@Resource
	private UserMapper um;

	public UserDO getUser() {
		return um.selectByPrimaryKey(1L);
	}
}
