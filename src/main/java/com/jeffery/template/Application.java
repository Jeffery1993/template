package com.jeffery.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jeffery.template.common.config.AppConfig;

/**
 * @author JEFFERY YEW
 * @since 17 NOV 2017
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

	public static void main(String[] args) {
		new AppConfig();
		SpringApplication.run(Application.class, args);
	}
}
