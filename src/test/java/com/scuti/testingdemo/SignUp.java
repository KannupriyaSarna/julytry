package com.scuti.testingdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp {

	public void SignUpAccount() {

		Driver obj = new Driver();

		WebDriver driver = obj.getdriver();

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get(Constants.HTTP_ECOMMERCE_SAIPRATAP_NET);

		driver.findElement(By.linkText("ACCOUNT")).click();
		driver.findElement(By.name("email")).sendKeys("xyzz@gmail.com");
		driver.findElement(By.name("password")).sendKeys("xyz");
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/form/table/tbody/tr[5]/td/a/div"));
		
		driver.findElement(By.linkText("SignUp")).click();
		driver.findElement(By.xpath("//input[@value ='2']")).click();
		driver.findElement(By.id("fname")).sendKeys("Kannu");
		driver.findElement(By.id("lname")).sendKeys("Sarna");
		driver.findElement(By.name("day")).sendKeys("10");
		driver.findElement(By.name("month")).sendKeys("8");
		driver.findElement(By.name("year")).sendKeys("1990");
		driver.findElement(By.name("email")).sendKeys("xyz@gmail.com");
		driver.findElement(By.name("houseno")).sendKeys("4306 Valley Ave");
		driver.findElement(By.name("add1")).sendKeys("Apt E");
		driver.findElement(By.name("city")).sendKeys("Pleasanton");
		driver.findElement(By.name("state")).sendKeys("USA");
		driver.findElement(By.name("country")).sendKeys("Pleasanton");
		driver.findElement(By.name("postcode")).sendKeys("110005");
		driver.findElement(By.name("phone")).sendKeys("4158795856");
		driver.findElement(By.name("password")).sendKeys("4158795856");
		driver.findElement(By.name("cpassword")).sendKeys("4158795856");
		driver.findElement(By.name("newsletter")).isSelected();
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.name("Submit")).click();

	}
	

}