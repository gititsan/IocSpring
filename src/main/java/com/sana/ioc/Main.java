package com.sana.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	static ApplicationContext context;
	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(Config.class);
		Person p=context.getBean(Person.class);
		Book b=context.getBean(Book.class);
		p.setFname("Jordan Peterson");
		b.setName("12 rules for life");
		System.out.println("Writer name : "+p.getFname()+ " And Book Name : "+b.getName());

	}

}
