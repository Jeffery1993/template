package com.jeffery.template.common.base.exception;

import com.jeffery.template.common.base.ErrorType;

public class AuthorityException extends ServiceException {

	private static final long serialVersionUID = 1L;

	public AuthorityException() {
		super();
	}

	public AuthorityException(String message) {
		super(message);
	}

	public AuthorityException(String message, Throwable cause) {
		super(message, cause);
	}

	public AuthorityException(Throwable cause) {
		super(cause);
	}

	@Override
	public ErrorType getErrorType() {
		return ErrorType.AUTHORITY_ERROR;
	}

}
