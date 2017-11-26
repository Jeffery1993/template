package com.jeffery.template.common.config;

import java.io.IOException;
import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {

	private static final Logger logger = LoggerFactory.getLogger(AppConfig.class);

	public AppConfig() {
		initProperties("/application.properties");
	}

	private static void initProperties(String path) {
		InputStream in = null;
		try {
			in = AppConfig.class.getResourceAsStream(path);
			System.getProperties().load(in);
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				logger.error(e.getMessage(), e);
			}

		}
	}

	public static String getConfigValue(String key) {
		return System.getProperty(key);
	}

}
