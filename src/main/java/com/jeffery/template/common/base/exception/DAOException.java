package com.jeffery.template.common.base.exception;

import com.jeffery.template.common.base.ErrorType;

public class DAOException extends ServiceException {

	private static final long serialVersionUID = 1L;

	public DAOException() {
		super();
	}

	public DAOException(String message) {
		super(message);
	}

	public DAOException(String message, Throwable cause) {
		super(message, cause);
	}

	public DAOException(Throwable cause) {
		super(cause);
	}

	@Override
	public ErrorType getErrorType() {
		return ErrorType.SQL_ERROR;
	}

}
