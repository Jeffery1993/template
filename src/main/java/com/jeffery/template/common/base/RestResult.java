package com.jeffery.template.common.base;

import java.io.Serializable;

public class RestResult<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	private Boolean state = false;
	private T data;
	private ErrorType errorType;
	private String errorMessage;

	public Boolean getState() {
		return state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public ErrorType getErrorType() {
		return errorType;
	}

	public void setErrorType(ErrorType errorType) {
		this.errorType = errorType;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
