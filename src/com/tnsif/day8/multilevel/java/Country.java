package com.tnsif.day8.multilevel.java;

public class Country {
	private String  name;
	private String capitall;
	public Country() {
		super();
	}
	public Country(String name, String capitall) {
		super();
		this.name = name;
		this.capitall = capitall;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapitall() {
		return capitall;
	}
	public void setCapitall(String capitall) {
		this.capitall = capitall;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", capitall=" + capitall + "]";
	}

	
	
	

}
