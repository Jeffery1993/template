package com.jeffery.template.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeffery.template.common.base.DAO;
import com.jeffery.template.common.base.Mapper;
import com.jeffery.template.dal.mapper.CarInfoMapper;
import com.jeffery.template.dal.model.CarInfoModel;
import com.jeffery.template.dal.param.CarInfoParam;

@Service
public class CarInfoDao extends DAO<CarInfoParam, CarInfoModel> {

	@Autowired
	private CarInfoMapper mapper;

	@Override
	public Mapper<CarInfoParam, CarInfoModel> getMapper() {
		return mapper;
	}

}
