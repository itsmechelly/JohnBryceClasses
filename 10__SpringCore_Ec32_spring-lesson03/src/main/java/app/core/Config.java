package app.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Config {

	@Bean
	public String applicationName() {
		return "Lesson 3 - SPRING";
	}
}
