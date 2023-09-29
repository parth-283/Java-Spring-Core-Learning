package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");

		Student stud1 = con.getBean("ob", Student.class);
		Student stud2 = con.getBean("ob", Student.class);

		Teacher t1 = con.getBean("teacher", Teacher.class);
		Teacher t2 = con.getBean("teacher", Teacher.class);

		System.out.println(stud1.hashCode());
		System.out.println(stud2.hashCode());

		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());

	}

}
