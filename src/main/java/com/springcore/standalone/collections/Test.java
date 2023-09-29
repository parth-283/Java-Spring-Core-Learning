package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/standalone/collections/aloneconfig.xml");

		Person P1 = context.getBean("person1", Person.class);

		System.out.println(P1);
		System.out.println(P1.getFriends().getClass().getName());

		System.out.println("____________________________________________");

		System.out.println(P1.getFeestructure().getClass().getName());
	}

}
