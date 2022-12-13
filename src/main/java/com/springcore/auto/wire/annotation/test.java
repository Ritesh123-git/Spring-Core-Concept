package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	private static ApplicationContext context;

	public static void main(String args[]) {
		context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");
		Emp emp= (Emp) context.getBean("emp1");
		System.out.println(emp);
	}

}
