package com.jeffery.template.common.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.alibaba.druid.pool.DruidDataSourceFactory;

@Configuration
@MapperScan(basePackages = { "com.jeffery.template.data.mapper" })
public class MybatisConfig {

	@Bean
	public DataSource getDataSource() throws Exception {
		Properties properties = new Properties();
		properties.put("driver", "com.mysql.jdbc.Driver");
		properties.put("db.url", System.getProperty("db.url"));
		properties.put("db.username", System.getProperty("db.username"));
		properties.put("db.password", System.getProperty("db.password"));
		properties.put("maxActive", "2335");
		properties.put("filters", "stat");
		return DruidDataSourceFactory.createDataSource(properties);
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
		return bean.getObject();
	}

}