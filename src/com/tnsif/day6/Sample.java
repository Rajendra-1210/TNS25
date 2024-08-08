package com.tnsif.day6;

public class Sample {
	int a=10;
	public int b=20;
	private int c=30;
	protected int d=40;
	void defaultdisplay()
	{
		System.out.println("display method");
		System.out.println("the value is "+a);
		
	}
	public int publicdisplay()
	{
		System.out.println("public method");
		return b;
	}
	protected int protecteddisplay()
	{
		System.out.println(" protected display");
		return d;
	}

}
