package com.jeffery.template.mvc.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jeffery.template.common.base.AbstractController;
import com.jeffery.template.common.base.ErrorType;
import com.jeffery.template.common.base.PageList;
import com.jeffery.template.common.base.RestResult;
import com.jeffery.template.dal.model.CarInfoModel;
import com.jeffery.template.dal.param.CarInfoParam;
import com.jeffery.template.mvc.service.CarInfoService;

@RestController
@RequestMapping("/api/v1")
public class CarInfoController extends AbstractController {

	@Autowired
	private CarInfoService carInfoService;

	@RequestMapping(value = "/car-info", produces = "application/json; charset=utf-8", method = RequestMethod.PUT)
	public RestResult<String> createRecords(@RequestBody List<CarInfoModel> carInfoModelList) {
		RestResult<String> res = new RestResult<String>();
		try {
			carInfoService.createRecords(carInfoModelList);
			res.setState(true);
		} catch (SQLException e) {
			logger.error(e.getMessage(), e);
			res.setErrorType(ErrorType.SQL_ERROR);
			res.setErrorMessage(ErrorType.SQL_ERROR.getMsg());
			res.setState(false);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			res.setErrorType(ErrorType.UNKNOWN_ERROR);
			res.setErrorMessage(ErrorType.UNKNOWN_ERROR.getMsg());
			res.setState(false);
		}
		return res;
	}

	@RequestMapping(value = "/car-info", produces = "application/json; charset=utf-8", method = RequestMethod.GET)
	public RestResult<PageList<CarInfoModel>> retrieveRecords(@RequestBody CarInfoParam carInfoParam) {
		RestResult<PageList<CarInfoModel>> res = new RestResult<PageList<CarInfoModel>>();
		try {
			PageList<CarInfoModel> pgList = carInfoService.retrieveRecords(carInfoParam);
			res.setData(pgList);
			res.setState(true);
		} catch (SQLException e) {
			logger.error(e.getMessage(), e);
			res.setErrorType(ErrorType.SQL_ERROR);
			res.setErrorMessage(ErrorType.SQL_ERROR.getMsg());
			res.setState(false);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			res.setErrorType(ErrorType.UNKNOWN_ERROR);
			res.setErrorMessage(ErrorType.UNKNOWN_ERROR.getMsg());
			res.setState(false);
		}
		return res;
	}

	@RequestMapping(value = "/car-info", produces = "application/json; charset=utf-8", method = RequestMethod.POST)
	public RestResult<String> updateRecords(@RequestBody List<CarInfoModel> carInfoModelList) {
		RestResult<String> res = new RestResult<String>();
		try {
			carInfoService.updateRecords(carInfoModelList);
			res.setState(true);
		} catch (SQLException e) {
			logger.error(e.getMessage(), e);
			res.setErrorType(ErrorType.SQL_ERROR);
			res.setErrorMessage(ErrorType.SQL_ERROR.getMsg());
			res.setState(false);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			res.setErrorType(ErrorType.UNKNOWN_ERROR);
			res.setErrorMessage(ErrorType.UNKNOWN_ERROR.getMsg());
			res.setState(false);
		}
		return res;
	}

	@RequestMapping(value = "/car-info", produces = "application/json; charset=utf-8", method = RequestMethod.DELETE)
	public RestResult<String> deleteRecords(@RequestParam(value = "idList", required = true) List<Long> idList) {
		RestResult<String> res = new RestResult<String>();
		try {
			carInfoService.deleteRecords(idList);
			res.setState(true);
		} catch (SQLException e) {
			logger.error(e.getMessage(), e);
			res.setErrorType(ErrorType.SQL_ERROR);
			res.setErrorMessage(ErrorType.SQL_ERROR.getMsg());
			res.setState(false);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			res.setErrorType(ErrorType.UNKNOWN_ERROR);
			res.setErrorMessage(ErrorType.UNKNOWN_ERROR.getMsg());
			res.setState(false);
		}
		return res;
	}

}
