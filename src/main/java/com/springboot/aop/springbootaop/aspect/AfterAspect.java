package com.springboot.aop.springbootaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@After(value = "execution(* com.springboot.aop.springbootaop.business.*.*(..))")
	public void afterReturning(JoinPoint joinPoint) {
		logger.info("after execution of {}", joinPoint);
	}

	@AfterReturning(value = "execution(* com.springboot.aop.springbootaop.business.*.*(..))", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		logger.info("{} returned with value {}", joinPoint, result);
	}

	@AfterThrowing(value = "execution(* com.springboot.aop.springbootaop.business.*.*(..))", throwing = "exception")
	public void afterReturning(JoinPoint joinPoint, Exception exception) {
		logger.info("{} throw exception {}", joinPoint, exception);
	}
}
