package com.scuti.testingdemo;

public class FibnociSeries {

	// 0,1,1,2,3,5,8,13,21

	public static void main(String[] args) {

		int x = 0;
		int y = 1;
		int z = 0;

		System.out.print(x + " " + y + " ");

		for (int i = 0; i <= 10; i++) {

			z = x + y;
			x = y;
			y = z;

			System.out.print(z + " ");
		}

	}

}
