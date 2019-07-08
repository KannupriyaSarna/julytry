package com.scuti.testingdemo;

public class SmallerNo {
	
	public static void main(String[] args) {
		
		int a[] = {10,52,68,48,2};
		
		int min = a[0];
		
		for(int i = 1;i<a.length; i++) {
			
			min = Math.min(a[0], a[i]);
		}
		System.out.println(min);
	}
       
}
