package com.jeffery.template.common.base.exception;

import com.jeffery.template.common.base.ErrorType;

public class ServiceException extends Exception {

	private static final long serialVersionUID = 1L;

	public ServiceException() {
		super();
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public ServiceException(Throwable cause) {
		super(cause);
	}

	public ErrorType getErrorType() {
		return ErrorType.SERVICE_ERROR;
	}

}
