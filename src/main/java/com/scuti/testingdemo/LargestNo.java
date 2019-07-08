package com.scuti.testingdemo;

public class LargestNo {

	public static void main(String[] args) {

		int k[] = { 23, 6, 8, 88 };

		int max = k[0];
		//23
		
		//6 > 23
		//8 > 23
		//88 > 23
		

		//Math is a Class in java and minimum and maximum are the function. 
		for (int i = 1; i < k.length; i++) {

			max = Math.min(max, k[i]);

		}
		//this is enhanced for loop
		for (int i : k) {

			max = Math.min(max, i);

		}

		System.out.println(max);
	}

}
