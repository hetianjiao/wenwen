package com.wenwen.exam.controller.user;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wenwen.exam.model.User;
import com.wenwen.exam.service.user.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService us;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody User getInfo() {
		return us.getUser();
	}

}
