package com.jeffery.template.common.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author JEFFERY YEW
 * @since 18 NOV 2017
 */
public abstract class AbstractController {

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	protected String getCurrentClassName() {
		return this.getClass().getName();
	}

	protected String getCurrentMethodName() {
		return Thread.currentThread().getStackTrace()[2].getMethodName();
	}

}
