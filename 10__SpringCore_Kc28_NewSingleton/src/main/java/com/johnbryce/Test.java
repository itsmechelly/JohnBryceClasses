package com.johnbryce;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.johnbryce.beans.MySingleton;
import com.johnbryce.beans.Person;
import com.johnbryce.config.MyConfiguration;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfiguration.class);

		MySingleton s1 = ctx.getBean(MySingleton.class);
		MySingleton s2 = ctx.getBean(MySingleton.class);

		Person p1 = ctx.getBean(Person.class);
		Person p2 = ctx.getBean(Person.class);
		Person p3 = new Person();

		((AnnotationConfigApplicationContext) ctx).close();
	}
}
