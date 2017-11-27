package com.jeffery.template;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.jeffery.template.common.config.AppConfig;

@SpringBootApplication
@EnableAutoConfiguration
public class Application {

	public static void main(String[] args) {
		new AppConfig();
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return new CommandLineRunner() {

			@SuppressWarnings("unused")
			private ApplicationContext ctx;

			public CommandLineRunner setApplicationContext(ApplicationContext ctx) {
				this.ctx = ctx;
				return this;
			}

			@Override
			public void run(String... args) {

			}

		}.setApplicationContext(ctx);
	}

}
