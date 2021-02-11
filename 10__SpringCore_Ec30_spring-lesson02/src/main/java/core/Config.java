package core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import core.components.School;

@Configuration
@ComponentScan
@PropertySource("app.properties")
public class Config {

	@Bean
	public School otherSchool() {
		return new School();
	}
}
