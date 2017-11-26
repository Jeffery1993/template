package com.jeffery.template.common.base;

import org.springframework.beans.BeanUtils;

public abstract class AbstractVO extends AbstractModel {

	private static final long serialVersionUID = 1L;

	public AbstractVO() {

	}

	public AbstractVO(AbstractModel model) {
		BeanUtils.copyProperties(model, this);
	}

}
