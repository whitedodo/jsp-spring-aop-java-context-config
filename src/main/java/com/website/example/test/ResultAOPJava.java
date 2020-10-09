/*
 * 	
 *  주제(Subject): Spring Framework 4.2 - AOP 구현하기(Java - Context)
 *  생성일자(Create Date): 2020-10-09
 *  파일명(Filename): ResultAOPJava.java
 *  저자(Author): Dodo / rabbit.white at daum dot net
 *  비고(Description):
 * 
 */

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
