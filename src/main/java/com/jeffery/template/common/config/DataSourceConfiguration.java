package com.jeffery.template.common.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class DataSourceConfiguration {
	@Value("${jdbc.driver}")
	private String driver;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.username}")
	private String username;
	@Value("${jdbc.password}")
	private String password;
	@Value("${jdbc.maxActive}")
	private int maxActive;
	@Value("${jdbc.maxIdel}")
	private int maxIdel;
	@Value("${jdbc.maxWait}")
	private int maxWait;

	@Bean
	public DataSource dataSource() {
		DataSource dataSource = new DataSource();
		dataSource.setDriverClassName(driver);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		dataSource.setMaxActive(maxActive);
		dataSource.setMaxIdle(maxIdel);
		dataSource.setMaxWait(maxWait);
		dataSource.setValidationQuery("SELECT 1");
		dataSource.setTestOnBorrow(true);
		return dataSource;
	}
}
