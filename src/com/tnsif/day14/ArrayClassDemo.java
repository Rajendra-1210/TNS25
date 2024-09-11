package com.tnsif.day14;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
		int arr[]= {10,7,8,36,87,56,86,45,45};
		//for(int i:arr)
		System.out.println("array is :"+Arrays.toString(arr));
		//sorting the ascending
		Arrays.sort(arr);
		System.out.println("array is sort :"+Arrays.toString(arr));
        //searching
		int key=45;
		System.out.println("array element is found :"+Arrays.binarySearch(arr, 0, 8, 45));
		System.out.println("length of the array"+arr.length);
	}
}
