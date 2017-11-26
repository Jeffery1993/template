package com.jeffery.template.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jeffery.template.common.base.AbstractController;
import com.jeffery.template.data.dao.UserDao;
import com.jeffery.template.data.model.UserModel;
import com.jeffery.template.mvc.view.UserVO;

@RestController
@RequestMapping("/api/v1")
public class UserController extends AbstractController {

	@Autowired
	private UserDao userDao;

	@RequestMapping(value = "/user", produces = "application/json; charset=utf-8", method = RequestMethod.GET)
	public UserVO findUserByIdController(@RequestParam(value = "id", required = true) Long id) {

		logger.info("***Enter" + getCurrentMethodName() + "***");

		UserModel userModel = userDao.find(id);
		UserVO userVO = new UserVO(userModel);

		logger.info("***Exit" + getCurrentMethodName() + "***");
		return userVO;
	}

}
