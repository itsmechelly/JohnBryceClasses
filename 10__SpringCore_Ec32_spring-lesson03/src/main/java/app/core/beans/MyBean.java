package app.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

	@Autowired
	String appName;

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ":" + appName;
	}

}
