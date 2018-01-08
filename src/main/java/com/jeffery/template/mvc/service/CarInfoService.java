package com.jeffery.template.mvc.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeffery.template.common.base.AbstractService;
import com.jeffery.template.common.base.PageList;
import com.jeffery.template.dal.dao.CarInfoDao;
import com.jeffery.template.dal.model.CarInfoModel;
import com.jeffery.template.dal.param.CarInfoParam;
import com.jeffery.template.mvc.model.CarInfoVO;
import com.jeffery.template.mvc.param.CarInfoQueryParam;

@Service
public class CarInfoService extends AbstractService {

	@Autowired
	private CarInfoDao carInfoDao;

	public void createRecords(List<CarInfoModel> carInfoModelList) throws SQLException {
		try {
			carInfoDao.create(carInfoModelList);
		} catch (Exception e) {
			throw new SQLException(e);
		}
	}

	public PageList<CarInfoVO> retrieveRecords(CarInfoQueryParam carInfoQueryParam) throws SQLException {
		PageList<CarInfoModel> pgList = null;
		try {
			CarInfoParam param = carInfoQueryParam.toCarInfoParam();
			pgList = carInfoDao.query(param);
		} catch (Exception e) {
			throw new SQLException(e);
		}

		PageList<CarInfoVO> voList = new PageList<CarInfoVO>();
		List<CarInfoVO> dataList = voList.getDataList();
		for (CarInfoModel m : pgList.getDataList()) {
			dataList.add(new CarInfoVO(m));
		}
		voList.setTotalCount(dataList.size());
		return voList;
	}

	public void updateRecords(List<CarInfoModel> carInfoModelList) throws SQLException {
		try {
			for (CarInfoModel carInfoModel : carInfoModelList) {
				carInfoDao.update(carInfoModel);
			}
		} catch (Exception e) {
			throw new SQLException(e);
		}
	}

	public void deleteRecords(List<Long> idList) throws SQLException {
		try {
			for (Long id : idList) {
				carInfoDao.delete(id);
			}
		} catch (Exception e) {
			throw new SQLException(e);
		}
	}

}
