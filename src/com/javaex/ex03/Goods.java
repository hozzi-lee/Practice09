package com.javaex.ex03;

public class Goods {

	// field
	private String name;
	private int price;
	private int count;
	private static int allCount;



	// constructors
	public Goods() {
		super();
	}
	public Goods(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
		this.allCount += count;
	}



	// method getter/setter
	public static int allCount() {
		return allCount;
	}


	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}

	public void setCount(int count) {
		this.count = count;
	}
	public int getCount() {
		return count;
	}

	// method
	public void showInfo() {
		System.out.println( name + "(가격:" + price + "원)이 " + count + " 개 입고 되었습니다.");
	}


}
