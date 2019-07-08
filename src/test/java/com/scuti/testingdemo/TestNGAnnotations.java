package com.scuti.testingdemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	SignUp DataDriven = new SignUp();
	
	

	@BeforeClass 
	public void Login() {
		System.out.println("One");
	}

	@DataProvider
	public void getdata() {
		
		
	}
	
	@Test(priority=3, groups = "Login")
	public void TestCase0(String Email, String password) {
		System.out.println("Two");

	}

	@AfterClass
	public void AfterTest() {
		System.out.println("Three");
	
	}

	@Test(priority=1, groups = "Products")
	public void TestCase1() {
		System.out.println("four");
	}

	@Test(priority=1, groups = "Login")
	public void TestCase2() {
		System.out.println("five");
	}
}
