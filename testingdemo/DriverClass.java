package com.scuti.testingdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DriverClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//Administrator//Downloads//desktop//Studies//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.crmpro.com/index.html");
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("CRMPRO - CRM software for customer relationship management, sales, and support.")) {

			System.out.println("(1) - Title of correct");
		} else {

			System.out.println("title is not correct");
		}
		String CurrentUL = driver.getCurrentUrl();
		System.out.println(CurrentUL);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kapil8888");
		// driver.findElement(By.cssSelector("#loginForm > div >
		// input:nth-child(2)")).sendKeys("kapil8888");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("kapil8888");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Select se = new Select(driver.findElement(By.xpath("/html/frameset/frame[1]")));
		se.selectByVisibleText("View Today");
		//driver.findElement(By.xpath("//input[@title='Tasks']")).click();
		driver.findElement(By.name("search_target")).click();
		// Select select = new Select(driver.findElement(By.name("cs_status")));
		driver.quit();

	}

}
