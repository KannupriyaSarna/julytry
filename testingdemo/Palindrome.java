package com.scuti.testingdemo;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String pan = "dad";
		String pan2 = "dad";
	    String temp= "";
		
		for(int i = pan.length()-1; i>=0; i--) {
			temp = temp+pan.charAt(i);
		}
		
		System.out.println(temp);
			if (pan2.equals(temp)) {
				
				System.out.println("it is a palindrome");
			}
			else{
				System.out.println("It is not a palindrome");
			}
		
	}

}
