package com.tnsif.day14;

public class Pyramid {

	public static void main(String[] args) {
		int n=5;
	 for (int i=0;i<n;i++)
	 {
		 for(int j=i;j>=0;j--)
		 {
			 int k=n-2;
			 while(k!=0)
			 {
				 System.out.print();
				 k--;
			 }
			 n--;
		 }
		 
			 System.out.print("*");
			 
		 }
		
	 System.out.println();

	}

}
