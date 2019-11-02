package com.springboot.aop.springbootaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinCutConfig {

	@Pointcut("execution(* com.springboot.aop.springbootaop.data.*.*(..))")
	public void dataLayerExecution() {}

	@Pointcut("execution(* com.springboot.aop.springbootaop.business.*.*(..))")
	public void businessLayerExecution() {}

	@Pointcut("bean(Dao*)")
	public void beanStartingWithDao() {}
	
	@Pointcut("within(com.springboot.aop.springbootaop.data..*)")
	public void dataLayerExecutionWithWithin() {}
	
	@Pointcut("@annotation(com.springboot.aop.springbootaop.aspect.TrackTime)")
	public void trackTimeAnnotation() {}
}
