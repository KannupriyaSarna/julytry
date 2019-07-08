package com.scuti.testingdemo;

import java.util.ArrayList;

public class Adding {
	public static void main(String[] args) {
	
		String [] arr = {"A"," B", "C", "D"," E"};
		ArrayList<String> arr1= new ArrayList<String>();
		for(int i = 0; i<arr.length; i++) {
			arr1.add(arr[i]);
			
		}
	
		arr1.remove("C");
		arr1.remove("D");
		
		String[] arr2 = new String[arr1.size()];
		for(int i = 0; i<arr1.size(); i++) {
			
			arr2[i] = arr1.get(i);
		}
		
	}
	
	

}
