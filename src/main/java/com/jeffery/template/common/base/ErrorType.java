package com.jeffery.template.common.base;

public enum ErrorType {

	AUTHORITY_ERROR("权限错误"), SQL_ERROR("数据库错误"), UNKNOWN_ERROR("未知错误");

	private String msg;

	private ErrorType(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

}
