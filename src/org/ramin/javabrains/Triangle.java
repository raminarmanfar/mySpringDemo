package org.ramin.javabrains;

public class Triangle {
	private String shapeType;
	private int height;
	
	public Triangle(String shapeType) {
		this.shapeType = shapeType;
	}

	public Triangle(int height) {
		this.height = height;
	}

	public Triangle(String shapeType, int height) {
		this.shapeType = shapeType;
		this.height = height;
	}
	
	/*
	public void setShapeType(String shapeType) {
		this.shapeType = shapeType;
	}
	*/

	public void draw() {
		System.out.print(shapeType + " Triangle Drawn of height " + height);
	}
}
