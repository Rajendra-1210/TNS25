package com.tnsif.day8.multilevel.java;

public class City {
	private String cityname;
	private String area;
	public City() {
		super();
	}
	public City(String cityname, String area,String statename, String language,String name, String capitall) {
		super( statename,  language, name,  capitall);
		this.cityname = cityname;
		this.area = area;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	
	
	
	

}
