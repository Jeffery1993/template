package com.jeffery.template;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

import com.jeffery.template.common.config.AppConfig;

public class SpringBootStartApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

		new AppConfig();
		return builder.sources(Application.class);

	}

}
