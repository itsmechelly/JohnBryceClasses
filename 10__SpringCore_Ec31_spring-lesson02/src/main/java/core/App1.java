package core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import core.components.School;

public class App1 {

	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {
			System.out.println("Spring container is up");
			
			School school1 = context.getBean("school", School.class);
			School school2 = context.getBean("otherSchool", School.class);
			
			System.out.println(school1);
			System.out.println(school2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
