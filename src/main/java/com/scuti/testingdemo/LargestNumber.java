package com.scuti.testingdemo;

public class LargestNumber {

	public static void main(String[] args) {
		  //index  0,1,2,3,4,5,6,7,8
		
		int a[] = {1,2,3,4,5,6,7,8,9};
				int temp=a[0];
				for (int i = 1; i < a.length; i++) {
					if(a[i]>temp) {
						temp=a[i];
					}
				}
				System.out.println(temp);
	}
	

 	 
    }	
