package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import app.core.dao.StudentDAO;
import app.core.entities.Student;

@SpringBootApplication
@EnableTransactionManagement
public class Application {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);){
			
			StudentDAO studentDAO = ctx.getBean(StudentDAO.class);
			studentDAO.saveStudent(new Student("aaa", "aaa@mail"));
			studentDAO.saveStudent(new Student("bbb", "bbb@mail"));			
		}
		
	}

}
