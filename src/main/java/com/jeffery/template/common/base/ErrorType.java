package com.jeffery.template.common.base;

public enum ErrorType {

	AUTHORITY_ERROR, SQL_ERROR, PARAM_ERROR, SERVICE_ERROR, UNKNOWN_ERROR;

	@Override
	public String toString() {
		return this.name();
	}

}
