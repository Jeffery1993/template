package com.jeffery.template.common.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class LoggerAspectConfig {

	protected static final Logger logger = LoggerFactory.getLogger(LoggerAspectConfig.class);

	@Pointcut("execution(* com.jeffery.template.mvc.controller.*.*(..))")
	private void crud() {
	}

	@Before("crud()")
	public void before(JoinPoint joinPoint) {
		logger.info("***Enter " + getMethodName(joinPoint) + "***");
	}

	@AfterReturning("crud()")
	public void afterReturning(JoinPoint joinPoint) {
		logger.info("***Exit " + getMethodName(joinPoint) + "***");
	}

	@AfterThrowing("crud()")
	public void afterThrowing(JoinPoint joinPoint) {
		logger.error("***Error " + getMethodName(joinPoint) + "***");
	}

	protected String getMethodName(JoinPoint joinPoint) {
		return joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName();
	}

}
