package com.jeffery.template.common.base;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.JSON;

public abstract class AbstractModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private Date gmtCreate;
	private Date gmtModified;
	private List<String> changeSet;

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

	public List<String> getChangeSet() {
		return changeSet;
	}

	public void setChangeSet() {
		List<String> changeSet = new ArrayList<String>();
		Field[] fields = this.getClass().getDeclaredFields();
		for (Field field : fields) {
			changeSet.add(field.getName());
		}
		this.changeSet = changeSet;
	}

	public String toString() {
		return JSON.toJSONString(this);
	}

}
