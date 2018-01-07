package com.jeffery.template.common.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LoggerAspectConfig {

	protected static final Logger logger = LoggerFactory.getLogger(LoggerAspectConfig.class);

	@Pointcut("execution(* com.jeffery.template.mvc.controller.*.*(..))")
	private void crud(ProceedingJoinPoint joinPoint) {
	}

	@Before("crud()")
	public void before(ProceedingJoinPoint joinPoint) {
		logger.info("***Enter " + getMethodName(joinPoint));
	}

	@AfterReturning("crud()")
	public void afterReturning(ProceedingJoinPoint joinPoint) {
		logger.info("***Exit " + getMethodName(joinPoint));
	}

	@AfterThrowing("crud()")
	public void afterThrowing(ProceedingJoinPoint joinPoint) {
		logger.error("Error in " + getMethodName(joinPoint));
	}

	protected String getMethodName(ProceedingJoinPoint joinPoint) {
		return joinPoint.getSignature().getDeclaringTypeName() + joinPoint.getSignature().getName();
	}

}
