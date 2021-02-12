package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.beans.MyBean;

public class App1 {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);) {
			MyBean bean = ctx.getBean(MyBean.class);
			System.out.println(bean);
		}

	}
}
