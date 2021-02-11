package core.components.cars;

import org.springframework.stereotype.Component;

@Component
public class TurboGear implements Gear {

	private int state;
	private final int max = 8;

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
