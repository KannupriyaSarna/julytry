package com.scuti.testingdemo;

import org.openqa.selenium.WebDriver;



public class GetFunctions {

	Driver obj = new Driver();
	WebDriver driver = obj.getdriver();
	
	String title = driver.getTitle();
	String CurrentUrl = driver.getCurrentUrl();	
	String PageSource = driver.getPageSource();
	

}
