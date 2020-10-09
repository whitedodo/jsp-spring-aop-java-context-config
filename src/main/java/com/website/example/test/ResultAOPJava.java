package com.website.example.test;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
public class ResultAOPJava {
	
	@Pointcut("execution(* com.website.example.test.*(..))")
	public void method1() {
		System.out.println("결과: 메서드");
	}
	
}