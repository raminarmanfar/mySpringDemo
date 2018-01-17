package org.ramin.javabrains;

public class Triangle {
	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}

	public void draw() {
		System.out.print(message + " Drawn...");
	}
}
