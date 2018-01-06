package com.jeffery.template.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeffery.template.common.base.DAO;
import com.jeffery.template.common.base.Mapper;
import com.jeffery.template.dal.mapper.UserMapper;
import com.jeffery.template.dal.model.UserModel;
import com.jeffery.template.dal.param.UserParam;

@Service
public class UserDao extends DAO<UserParam, UserModel> {

	@Autowired
	private UserMapper mapper;

	@Override
	public Mapper<UserParam, UserModel> getMapper() {
		return mapper;
	}

}
