package org.ramin.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Triangle triangle = new Triangle();
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring.xml"});
		context.registerShutdownHook();
		BeanFactory factory = context;
		Triangle triangle = (Triangle) factory.getBean("triangle1");
		triangle.draw();
		
	}
}
