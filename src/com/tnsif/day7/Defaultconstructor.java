package com.tnsif.day7;

public class Defaultconstructor {
 private String name;
 private String address;
 private long mob;
 //default constructor
 public Defaultconstructor()
 {
	 System.out.println("this is default constructor");
 }
//parameter construtor
public Defaultconstructor(String name, String address, long mob) {
	super();
	this.name = name;
	this.address = address;
	this.mob = mob;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getMob() {
	return mob;
}
public void setMob(long mob) {
	this.mob = mob;
}
@Override
public String toString() {
	return "Defaultconstructor [name=" + name + ", address=" + address + ", mob=" + mob + "]";
}
}
