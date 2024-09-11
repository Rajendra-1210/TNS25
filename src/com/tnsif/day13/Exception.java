package com.tnsif.day13;

import java.rmi.AccessException;

public class Exception {

	public static void main(String[] args) {
		int a=30/2;
		System.out.println(a);
		try {
			int b=54/0;
		}
		catch()
		{
		  System.out.println();
		}
	}

}