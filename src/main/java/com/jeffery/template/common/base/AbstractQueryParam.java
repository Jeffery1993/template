package com.jeffery.template.common.base;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.JSON;

public abstract class AbstractQueryParam {

	private Long id;
	private List<Long> idList;
	private Date gmtCreate;
	private Date gmtModified;
	private Integer page = 1;
	private Integer pageSize = 10;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Long> getIdList() {
		return idList;
	}

	public void setIdList(List<Long> idList) {
		this.idList = idList;
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

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String toString() {
		return JSON.toJSONString(this);
	}

}
