package com.javaex.ex02;

public class Friend {

	// field
	private String name;
	private String hp;
	private String school;



	// constructors
	public Friend() {
		super();
	}
	public Friend(String name, String hp, String school) {
		this.name = name;
		this.hp = hp;
		this.school = school;
	}



	// method getter/setter
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getHp() {
		return hp;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	public String getSchool() {
		return school;
	}

	// method
	public String toString() {
		return "Friend [name=" + name + ", hp=" + hp + ", school=" + school + "]";
	}

	public void showInfo() {
		System.out.println("이름:" + name + "  핸드폰:" + hp + "  학교:" + school);
	}

}
