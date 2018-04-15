package com.jeffery.template.api.carinfo.param;

import org.springframework.beans.BeanUtils;

import com.jeffery.template.common.base.exception.ParamException;
import com.jeffery.template.common.dal.model.CarInfoModel;

import io.swagger.annotations.ApiModelProperty;

public class CarInfoUpdateParam {

	private Long id;
	@ApiModelProperty(value = "车辆品牌")
	private String carCategory;
	@ApiModelProperty(value = "车辆型号")
	private String carType;
	@ApiModelProperty(value = "最低价格")
	private Double lowestPrice;
	@ApiModelProperty(value = "最高价格")
	private Double highestPrice;	private String marks;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	public CarInfoModel toCarInfoModel() throws ParamException {
		if (id == null) {
			throw new ParamException("id cannot be null");
		}
		CarInfoModel m = new CarInfoModel();
		BeanUtils.copyProperties(this, m);
		return m;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}
	
}
