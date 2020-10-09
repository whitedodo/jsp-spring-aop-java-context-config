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
