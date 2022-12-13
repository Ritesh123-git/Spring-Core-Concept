package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/javaconfig/config.xml");
//		Student student= context.getBean("student", Student.class);
		
		
		ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student= context.getBean("getStudent", Student.class);
		System.out.println(student);
		student.study();
		

	}

}
