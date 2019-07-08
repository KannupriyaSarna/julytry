package com.scuti.testingdemo;

public class MathClassMethods {
	
	public static void main(String[] args) {
		
		//find the largest number in an array
		
		
		int k[] = { 23, 6, 8, 88 };
		int max = k[0];
		
		for (int i = 1; i<k.length; i++) {
			max = Math.max(k[0], k[i]);
		}
		
		System.out.println(max);
	}

}
