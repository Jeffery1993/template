package com.jeffery.template.common.base;

/**
 * @author JEFFERY YEW
 * @since 17 NOV 2017
 */
public class RestResult<T> {

	private boolean state = false;
	private PageList<T> pageList = new PageList<T>();
	private ErrorType errorType;
	private String errorMessage;

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public PageList<T> getPageList() {
		return pageList;
	}

	public void setPageList(PageList<T> pageList) {
		this.pageList = pageList;
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
