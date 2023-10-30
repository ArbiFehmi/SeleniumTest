package com.sopra.Selenium;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {
	private WebDriver driver;	
	JavascriptExecutor js;

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void test1() throws InterruptedException {

		Thread.sleep(1000);

		WebElement username = driver.findElement(By.id("Email"));
		WebElement password = driver.findElement(By.id("Password"));
		WebElement login = driver.findElement(By.className("login-button"));
		username.clear();
		password.clear();
		username.sendKeys("admin@yourstore.com");
		password.sendKeys("admin");
		System.out.println("----------Login--------------------");
		login.click();
		if (driver.getCurrentUrl().contains("https://admin-demo.nopcommerce.com/admin/"))
			System.out.println("----------Logged In Succesfuly--------------------");
		else
			System.out.println("----------Login Problem--------------------");
		
		List<WebElement> cardTitles = driver.findElements(By.xpath("//*[@class='card-title']"));

		System.out.println("card count: " + cardTitles.size());
		int i = 1;
		for (WebElement cardTitle : cardTitles) {
			String title = cardTitle.getText();
			System.out.println("***** Card Title " + i + " ***** " + title);
			i++;
		}
		WebElement logout = driver.findElement(By.linkText("Logout"));
		logout.click();
		System.out.println("----------Logout--------------------");
		
	}


}
