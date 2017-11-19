package com.jeffery.template.common.base;

import java.util.Date;

import com.alibaba.fastjson.JSON;

public abstract class AbstractModel {

	private Long id;
	private Date gmtCreate;
	private Date gmtModified;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String toString() {
		return JSON.toJSONString(this);
	}

}
