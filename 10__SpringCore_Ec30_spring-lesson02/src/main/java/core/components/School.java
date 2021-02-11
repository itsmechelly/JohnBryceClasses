package core.components;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("school1")
@Lazy
public class School {

	{
		System.out.println("School created");
	}
}
