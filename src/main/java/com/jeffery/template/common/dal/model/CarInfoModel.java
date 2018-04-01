package com.jeffery.template.common.dal.model;

import com.jeffery.fastapi.base.AbstractModel;

public class CarInfoModel extends AbstractModel {

	private static final long serialVersionUID = 1L;
	
	private String carCategory;
	private String carType;
	private Double lowestPrice;
	private Double highestPrice;
	
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
