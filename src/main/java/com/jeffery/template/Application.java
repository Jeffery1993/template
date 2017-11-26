package com.jeffery.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class Application {

	// @Bean
	// public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
	// return new CommandLineRunner() {
	//
	// @SuppressWarnings("unused")
	// private ApplicationContext ctx;
	//
	// public CommandLineRunner setApplicationContext(ApplicationContext ctx) {
	// this.ctx = ctx;
	// return this;
	// }
	//
	// @Override
	// public void run(String... ctx) {
	// SpringApplication.run(Application.class, ctx);
	// }
	//
	// }.setApplicationContext(ctx);
	// }

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

}
