package com.tnsif.day5;

public class person1 {
	private String name;
	private String aggress;
	private int age;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAggress() {
		return aggress;
	}
	public void setAggress(String aggress) {
		this.aggress = aggress;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "person1 [name=" + name + ", aggress=" + aggress + ", age=" + age + ", gender=" + gender + "]";
	}
	
	

}
