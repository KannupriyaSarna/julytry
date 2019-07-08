package com.scuti.testingdemo;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String anna = "Kapil";
		String anna1 = "paKil";
		
		char[] a = anna.toCharArray();
		char[] b = anna1.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(new String(a).equals(new String(b))) {
			
			System.out.println("It is an anagram");
		}
		else{
			System.out.println("It is not an anagram");
		}

			
		}
		
	
}
