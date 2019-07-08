package com.scuti.testingdemo;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ProductPage {

	@Test (priority = 2, groups = "Products")
	public void product() {

		Driver obj = new Driver();

		WebDriver driver = obj.getdriver();

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get(Constants.HTTP_ECOMMERCE_SAIPRATAP_NET);

		driver.findElement(By.linkText("PRODUCTS")).click();
		driver.findElement(By.xpath("//*[@id='rightcontent']/p[2]/a/img")).click();
		// driver.findElement(By.xpath("//input[@value='Add to
		// Cart']")).click();
		// driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table[1]/tbody/tr[3]/td/table/tbody/tr[5]/td[2]/a/div")).click();
		String productDell = driver
				.findElement(By
						.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr/td/form[1]/table/tbody/tr[2]/td[1]"))
				.getText();
		System.out.println(productDell);
		assertEquals(productDell.trim(), "Dell Inspiron 19R");

	}

	@Test (priority = 1, groups = "CheckPrice")
	public void PriceCheck() {
		Driver obj = new Driver();
		WebDriver driver = obj.getdriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get(Constants.HTTP_ECOMMERCE_SAIPRATAP_NET);

		driver.findElement(By.linkText("PRODUCTS")).click();
		driver.findElement(By.xpath("//*[@id='rightcontent']/p[2]/a/img")).click();
		
		String pricecheckDell = driver.findElement(By.xpath("//*[@id='price']")).getText();
        System.out.println(pricecheckDell);
        assertEquals( pricecheckDell,  "£1000.00");
	}

}