package app.core.beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

//	@Autowired
	@Resource
	String appName;

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ":" + appName;
	}

}
