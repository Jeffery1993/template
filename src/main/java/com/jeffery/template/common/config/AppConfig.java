package com.jeffery.template.common.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author JEFFERY YEW
 * @since 17 NOV 2017
 */
public class AppConfig {

	private static Properties properties = new Properties();

	public AppConfig() {
		InputStream in = getClass().getResourceAsStream("/application.properties");
		try {
			properties.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String key) {
		return (String) properties.get(key);
	}

}
