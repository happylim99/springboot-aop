package com.springboot.aop.springbootaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// what method will be intercepted
	// execution(* PACKAGE.*.*(..))

	@Before("execution(* com.springboot.aop.springbootaop.business.*.*(..))")
	public void before(JoinPoint joinPoint) {
		logger.info("intercept - {}", joinPoint);
	}
}
