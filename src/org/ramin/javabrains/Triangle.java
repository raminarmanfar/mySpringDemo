package org.ramin.javabrains;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware {
	private List<Point> points;
	private ApplicationContext context = null;

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean name is: " + beanName);
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw() {
		for (Point point: points) {
			System.out.println("Point = " + point.getId() + " (" + point.getX() + ", " + point.getY() + ")");						
		}
	}
}
