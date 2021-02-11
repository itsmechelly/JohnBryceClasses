package core.components.cars;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BasicGear implements Gear{

	private int state;
	private final int max = 5;
	
	@Override
	public int shiftUp() {
		
		if ((state + 1) <= max) {
			state++;
			return state;
		} else
			return state;
	}
	
	@Override
	public int shiftDown() {
		if ((state - 1) > 0) {
			state--;
			return state;
		} else
			return state;
	}
}
