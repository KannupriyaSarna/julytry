package com.scuti.testingdemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
	
	
	@DataProvider
	String[][] getData(){
		
		// instead of hard code you will use your Apache poi methods to get data from excel.
		
		return new String[][]{
				{"username1", "password1"},
				{"username2","password2"},
				{"username3","password2"},
				{"username4","password2"},
				{"username5","password2"},
				{"username6","password2"},
				{"username7","password2"},
				{"username8","password2"},
				{"username9","password2"}
			};
		
	}
	
	@Test(dataProvider = "getData")
	void runMyTest(String username, String password){
		
		System.out.println("USERNAE : " + username + " PASSWORD: " + password);
		
	}

}
