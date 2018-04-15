package com.jeffery.template.api.carinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeffery.template.api.carinfo.model.CarInfoVO;
import com.jeffery.template.api.carinfo.param.CarInfoCreateParam;
import com.jeffery.template.api.carinfo.param.CarInfoUpdateParam;
import com.jeffery.template.common.base.AbstractService;
import com.jeffery.template.common.base.PageList;
import com.jeffery.template.common.base.exception.ServiceException;
import com.jeffery.template.common.dal.dao.CarInfoDao;
import com.jeffery.template.common.dal.model.CarInfoModel;
import com.jeffery.template.common.dal.param.CarInfoParam;

@Service
public class CarInfoService extends AbstractService {

	@Autowired
	private CarInfoDao carInfoDao;

	public void createCarInfo(CarInfoCreateParam carInfoCreateParam) throws ServiceException {
		carInfoDao.create(carInfoCreateParam.toCarInfoModel());
	}

	public void updateCarInfo(CarInfoUpdateParam carInfoUpdateParam) throws ServiceException {
		carInfoDao.update(carInfoUpdateParam.toCarInfoModel());
	}

	public PageList<CarInfoVO> queryCarInfo(Integer page, Integer pageSize, List<Long> idList) throws ServiceException {
		PageList<CarInfoModel> pgList = null;
		CarInfoParam param = new CarInfoParam();
		param.setPageInfo(page, pageSize);
		if (idList != null && !idList.isEmpty()) {
			param.setIdList(idList);
		}
		pgList = carInfoDao.query(param);

		PageList<CarInfoVO> voList = new PageList<CarInfoVO>();
		List<CarInfoVO> dataList = voList.getDataList();
		for (CarInfoModel m : pgList.getDataList()) {
			dataList.add(new CarInfoVO(m));
		}
		voList.setTotalCount(pgList.getTotalCount());
		return voList;
	}

	public void deleteCarInfo(List<Long> idList) throws ServiceException {
		for (Long id : idList) {
			carInfoDao.delete(id);
		}
	}

}
