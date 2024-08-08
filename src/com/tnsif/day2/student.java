package com.tnsif.day2;

import java.util.Scanner;

public class student {

	public static void main(String[] args) {
		String name;
		String srn;
		int mob;
		float marks;
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student details");
		name=sc.next();
		srn=sc.next();
		mob=sc.nextInt();
		marks=sc.nextFloat();
		age=sc.nextInt();
		System.out.println("student details" +name+ " "+srn+ " "+mob+ " "+marks+ " "+age+ " ");

	}

}
