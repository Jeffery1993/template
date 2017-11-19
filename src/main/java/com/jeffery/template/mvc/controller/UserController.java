package com.jeffery.template.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jeffery.template.common.base.AbstractController;
import com.jeffery.template.data.mapper.UserMapper;
import com.jeffery.template.data.model.UserModel;

@RequestMapping("/api/v1")
@RestController
public class UserController extends AbstractController {

	@Autowired
	private UserMapper userDao;

	@RequestMapping(value = "/user", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public UserModel getHelloWorld() {
		logger.info("***Enter" + getCurrentMethodName() + "***");
		return userDao.findUserByName("yaoweijie");
	}

}
