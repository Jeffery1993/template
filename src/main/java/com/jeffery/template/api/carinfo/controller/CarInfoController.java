package com.jeffery.template.api.carinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jeffery.fastapi.base.AbstractController;
import com.jeffery.fastapi.base.ErrorType;
import com.jeffery.fastapi.base.PageList;
import com.jeffery.fastapi.base.RestResult;
import com.jeffery.fastapi.base.exception.ServiceException;
import com.jeffery.template.api.carinfo.model.CarInfoVO;
import com.jeffery.template.api.carinfo.service.CarInfoService;
import com.jeffery.template.common.dal.model.CarInfoModel;

@RestController
@RequestMapping("/api/v1")
public class CarInfoController extends AbstractController {

	@Autowired
	private CarInfoService carInfoService;

	@RequestMapping(value = "/carInfo", produces = "application/json; charset=utf-8", method = RequestMethod.POST)
	public RestResult<String> createCarInfo(@RequestBody List<CarInfoModel> carInfoModelList) {
		RestResult<String> res = new RestResult<String>();
		try {
			carInfoService.createCarInfo(carInfoModelList);
			res.setState(true);
		} catch (ServiceException e) {
			logger.error(e.getMessage());
			res.setErrorType(e.getErrorType());
			res.setErrorMessage(e.getMessage());
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			res.setErrorType(ErrorType.UNKNOWN_ERROR);
			res.setErrorMessage(e.getMessage());
		}
		return res;
	}

	@RequestMapping(value = "/carInfo", produces = "application/json; charset=utf-8", method = RequestMethod.PUT)
	public RestResult<String> updateCarInfo(@RequestBody List<CarInfoModel> carInfoModelList) {
		RestResult<String> res = new RestResult<String>();
		try {
			carInfoService.updateCarInfo(carInfoModelList);
			res.setState(true);
		} catch (ServiceException e) {
			logger.error(e.getMessage());
			res.setErrorType(e.getErrorType());
			res.setErrorMessage(e.getMessage());
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			res.setErrorType(ErrorType.UNKNOWN_ERROR);
			res.setErrorMessage(e.getMessage());
		}
		return res;
	}

	@RequestMapping(value = "/carInfo", produces = "application/json; charset=utf-8", method = RequestMethod.GET)
	public RestResult<PageList<CarInfoVO>> queryCarInfo(@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "pageSize", required = false) Integer pageSize,
			@RequestParam(value = "idList", required = false) List<Long> idList) {
		RestResult<PageList<CarInfoVO>> res = new RestResult<PageList<CarInfoVO>>();
		try {
			PageList<CarInfoVO> pgList = carInfoService.queryCarInfo(page, pageSize, idList);
			res.setData(pgList);
			res.setState(true);
		} catch (ServiceException e) {
			logger.error(e.getMessage());
			res.setErrorType(e.getErrorType());
			res.setErrorMessage(e.getMessage());
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			res.setErrorType(ErrorType.UNKNOWN_ERROR);
			res.setErrorMessage(e.getMessage());
		}
		return res;
	}

	@RequestMapping(value = "/carInfo", produces = "application/json; charset=utf-8", method = RequestMethod.DELETE)
	public RestResult<String> deleteCarInfo(@RequestParam(value = "idList", required = true) List<Long> idList) {
		RestResult<String> res = new RestResult<String>();
		try {
			carInfoService.deleteCarInfo(idList);
			res.setState(true);
		} catch (ServiceException e) {
			logger.error(e.getMessage());
			res.setErrorType(e.getErrorType());
			res.setErrorMessage(e.getMessage());
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			res.setErrorType(ErrorType.UNKNOWN_ERROR);
			res.setErrorMessage(e.getMessage());
		}
		return res;
	}

}
