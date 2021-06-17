package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable {

	// field
	private double width;
	private double height;

	

	// constructors
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}



	// method
	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return ( width + height ) * 2;
	}

	public double resize(double e) {
		return this.width = width * e;
		//		double h = this.height = height * e;
	}


}
