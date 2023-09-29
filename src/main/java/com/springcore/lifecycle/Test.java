package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecycle/samosaconfig.xml");

		Samosa S1 = (Samosa) context.getBean("S1");

		System.out.println(S1);

		System.out.println("______________________________________________");

		Pepsi P1 = (Pepsi) context.getBean("P1");

		System.out.println(P1);

		System.out.println("______________________________________________");

		Example E1 = (Example) context.getBean("e1");
		System.out.println(E1);

		context.registerShutdownHook();
	}

}
