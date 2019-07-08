package com.scuti.testingdemo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Driver {
	
	@BeforeTest
	public WebDriver getdriver() {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Administrator//Downloads//desktop//Studies//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
