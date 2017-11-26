package com.jeffery.template.data.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeffery.template.common.base.DAO;
import com.jeffery.template.common.base.Mapper;
import com.jeffery.template.data.mapper.UserMapper;
import com.jeffery.template.data.model.UserModel;
import com.jeffery.template.data.param.UserParam;

@Service
public class UserDao extends DAO<UserParam, UserModel> {

	@Autowired
	private UserMapper mapper;

	@Autowired
	public Mapper<UserParam, UserModel> getMapper() {
		return mapper;
	}

}
