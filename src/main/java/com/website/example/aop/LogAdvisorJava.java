package com.website.example.aop;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

// 어노테이션 방식
@Aspect
public class LogAdvisorJava implements LogAdvisor{

	@Before("execution(* com.website.example.test.ResultAOPJava.*(..))")
	public void beforeAdvice() {
		System.out.println("전 단계");
	}

	@After("execution(* com.website.example.test.ResultAOPJava.*(..))")
	public void afterAdvice() {
		System.out.println("후 단계");
	}

	public void aroundAdvice() {
		
	}
	
}
