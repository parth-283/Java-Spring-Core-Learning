package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(javaconfig.class);

		Student S1 = context.getBean("getStudent", Student.class);

		System.out.println(S1);
		S1.study();

	}

}
