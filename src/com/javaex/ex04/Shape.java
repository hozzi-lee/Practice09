package com.javaex.ex04;

public abstract class Shape {

	// field
	private int countSides;

	

	// constructors
	public Shape() {
		super();
	}

	public Shape(int countSides) {
		this.countSides = countSides;
	}



	// method getter/setter
	public int getCountSides() {
		return countSides;
	}

	// method
	public abstract double getArea();

	public abstract double getPerimeter();

}
