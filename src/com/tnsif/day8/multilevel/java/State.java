package com.tnsif.day8.multilevel.java;

public class State extends Country {
	private String statename;
	private String language;
	public State() {
		super();
	}
	public State(String statename, String language,String name, String capitall) {
        super( name,  capitall);
		this.statename = statename;
		this.language = language;
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "State [statename=" + statename + ", language=" + language + ", getName()=" + getName()
				+ ", getCapitall()=" + getCapitall() + "]";
	}
	
	
}
