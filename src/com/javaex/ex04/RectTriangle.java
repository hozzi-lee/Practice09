package com.javaex.ex04;

public class RectTriangle extends Shape {

	// field
	private double width;
	private double height;



	// constructors
	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}


	// method
	public double getArea() {
		return width * height * (0.5);
	}

	public double getPerimeter() {
		return width + height + Math.sqrt((width * width) + (height * height));
	}

}
