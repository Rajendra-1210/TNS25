package com.tnsif.day9.hierachical;

public class Main {

	public static void main(String[] args) {
		person p=new person();
		p=new Student("ECE","R21ENOO6","raju","banglore");
		if(p instanceof Student)
			System.out.println(p);
		p=new Employee("software","25000","deepu","banglore");
		if(p instanceof Employee)
			System.out.println(p);
	}

}
