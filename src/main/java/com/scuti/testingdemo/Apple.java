package com.scuti.testingdemo;


public class Apple {
	
	public static void main(String [] args) {
		Tuna t1 = new Tuna();
		String kbc = t1.sendMessage("String" );
		System.out.println(kbc);
		t1.sendMessage(3);
		t1.sendMessage("this is string", 4) ;
		t1.sendMessage("string", 2, 22.22);
		
	
	
	}
}
