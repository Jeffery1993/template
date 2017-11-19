package com.jeffery.template.common.base;

import java.util.List;

public class PageList<T> {

	private List<T> dataList;
	private AbstractQueryParam param;
	private Integer totalCount;

	public List<T> getDataList() {
		return dataList;
	}

	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}

	public AbstractQueryParam getParam() {
		return param;
	}

	public void setParam(AbstractQueryParam param) {
		this.param = param;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

}
