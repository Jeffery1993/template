package com.jeffery.template.api.carinfo.model;

import org.springframework.beans.BeanUtils;

import com.jeffery.template.common.base.AbstractVO;
import com.jeffery.template.common.base.util.DateUtils;
import com.jeffery.template.common.dal.model.CarInfoModel;

import io.swagger.annotations.ApiModelProperty;

public class CarInfoVO extends AbstractVO {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "车辆品牌")
	private String carCategory;
	@ApiModelProperty(value = "车辆型号")
	private String carType;
	@ApiModelProperty(value = "最低价格")
	private Double lowestPrice;
	@ApiModelProperty(value = "最高价格")
	private Double highestPrice;	private String marks;
	
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

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}
	
}
