package com.scuti.testingdemo;

public class Reverse {

	public static void main(String[] args) {

		String r = "Pizza";
		int length = r.length();
		String reverse = " ";

		for (int i = length - 1; i >= 0; i--) {

			reverse = reverse + r.charAt(i);

		}

		System.out.println(reverse);

		if (reverse == r) {

			System.out.println("It is a Palandorme");
		}

		else {

			System.out.println("It is not a Palandorme");
		}

	}

}
