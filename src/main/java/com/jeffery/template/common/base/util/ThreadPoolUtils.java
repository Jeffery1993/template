package com.jeffery.template.common.base.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolUtils {

	private static ExecutorService fixedThreadPool = Executors.newFixedThreadPool(100);

	public static ExecutorService getThreadPool() {
		return fixedThreadPool;
	}

}
