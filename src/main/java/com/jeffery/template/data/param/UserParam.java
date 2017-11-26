package com.jeffery.template.data.param;

import com.jeffery.template.common.base.AbstractQueryParam;

public class UserParam extends AbstractQueryParam {

	private static final long serialVersionUID = 1L;
	private String name;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
