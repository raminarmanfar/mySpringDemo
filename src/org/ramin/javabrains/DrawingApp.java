package org.ramin.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Triangle triangle = new Triangle();
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring.xml"});
		BeanFactory factory = context;
		Triangle triangle = (Triangle) factory.getBean("triangle");
		triangle.draw();
	}
}
