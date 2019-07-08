package com.DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.ExcelUtil;

public class DataDrivenTesting {

	public static void main(String[] args) {
		
		ExcelUtil excel = new ExcelUtil("C:\\Users\\kkataria\\workspace\\kannu\\testingdemo\\src\\test\\java\\com\\datadriventestingdata\\TestData.xlsx");
		
		String email = excel.getCellData("TestData", "Email", 2);
		System.out.println("email"+email);
		
		String password= excel.getCellData("TestData", "Password",2);
		System.out.println(password);
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Administrator//Downloads//desktop//Studies//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://ecommerce.saipratap.net/customerlogin.php");
		driver.findElement(By.cssSelector("#email")).sendKeys(email);
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
		driver.findElement(By.linkText("Login")).click();
		
	}
}
