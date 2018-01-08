package com.jeffery.template.mvc.model;

import org.springframework.beans.BeanUtils;

import com.jeffery.template.common.base.AbstractVO;
import com.jeffery.template.common.utils.DateUtils;
import com.jeffery.template.dal.model.CarInfoModel;

public class CarInfoVO extends AbstractVO {

	private static final long serialVersionUID = 1L;

	private Double lowestPrice;
	private Double highestPrice;
	private String carCategory;
	private String carType;

	public CarInfoVO(CarInfoModel model) {
		BeanUtils.copyProperties(model, this);
		this.gmtCreate = DateUtils.toString(model.getGmtCreate());
		this.gmtModified = DateUtils.toString(model.getGmtModified());
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

}
