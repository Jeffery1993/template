package com.jeffery.template.dal.param;

import com.jeffery.template.common.base.AbstractQueryParam;

public class CarInfoParam extends AbstractQueryParam {

	private static final long serialVersionUID = 1L;
	
	private Double lowestPrice;
	private Double highestPrice;
	private String carCategory;
	private String carType;
	
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
