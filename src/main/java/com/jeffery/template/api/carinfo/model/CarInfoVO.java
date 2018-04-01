package com.jeffery.template.api.carinfo.model;

import org.springframework.beans.BeanUtils;

import com.jeffery.fastapi.base.AbstractVO;
import com.jeffery.fastapi.base.utils.DateUtils;
import com.jeffery.template.common.dal.model.CarInfoModel;

public class CarInfoVO extends AbstractVO {

	private static final long serialVersionUID = 1L;

	private String carCategory;
	private String carType;
	private Double lowestPrice;
	private Double highestPrice;

	public CarInfoVO(CarInfoModel model) {
		BeanUtils.copyProperties(model, this);
		this.gmtCreate = DateUtils.toString(model.getGmtCreate());
		this.gmtModified = DateUtils.toString(model.getGmtModified());
	}

	public String getCarCategory() {
		return carCategory;
	}

	public void setCarCategory(String carCategory) {
		this.carCategory = carCategory;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public Double getLowestPrice() {
		return lowestPrice;
	}

	public void setLowestPrice(Double lowestPrice) {
		this.lowestPrice = lowestPrice;
	}

	public Double getHighestPrice() {
		return highestPrice;
	}

	public void setHighestPrice(Double highestPrice) {
		this.highestPrice = highestPrice;
	}

}
