package core.components.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	private Engine engine;
	@Autowired
	@Qualifier("basicGear") // Can also be used to set the primary qualifier.
	private Gear basicGear; // If we set an instance name as a component name spring will use that as
							// primary.

	public void startCar() {
		engine.start();
		System.out.println("Car is on");
	}

	public void startDrive() {
		int state = basicGear.shiftUp();
		System.out.println("Gear shifted to " + state);
	}
}
