/*
 * 	
 *  주제(Subject): Spring Framework 4.2 - AOP 구현하기(Java - Context)
 *  생성일자(Create Date): 2020-10-09
 *  파일명(Filename): LogAdvisorJava.java
 *  저자(Author): Dodo / rabbit.white at daum dot net
 *  비고(Description):
 * 
 */

package com.website.example.test;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {

	@Test
	public void test() {

		// 방법 1
		@SuppressWarnings("resource")
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationJavaAOP.xml");
		
		ResultAOPJava cal = factory.getBean(ResultAOPJava.class);
		cal.method1();
		
	}
	
}
