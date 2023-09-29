package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(" com/springcore/ref/refconfig.xml");

		A A1 =(A) context.getBean("aref");
		System.out.println(A1.getX());
		System.out.println(A1.getOb().getY());
	}

}
