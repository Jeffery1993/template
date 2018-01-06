package com.jeffery.template.mvc.view;

import com.jeffery.template.common.base.AbstractVO;
import com.jeffery.template.dal.model.UserModel;

public class UserVO extends AbstractVO {

	private static final long serialVersionUID = 1L;

	public UserVO(UserModel model) {
		super(model);
	}

}
