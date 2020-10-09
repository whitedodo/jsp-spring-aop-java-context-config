package com.website.example.aop;

import org.aspectj.lang.annotation.Aspect;

@Aspect
public interface LogAdvisor {

	public void beforeAdvice();
	public void afterAdvice();
	public void aroundAdvice();
	
}
