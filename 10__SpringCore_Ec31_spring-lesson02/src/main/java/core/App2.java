package core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import core.components.cars.Car;

public class App2 {

	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {
			System.out.println("Spring container is up");
			
			Car car = context.getBean(Car.class);
			car.startCar();
			car.startDrive();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
