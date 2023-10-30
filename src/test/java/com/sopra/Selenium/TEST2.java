package com.sopra.Selenium;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TEST2 {
	WebDriver driver;

	@Before
	public void lauunch() {
		System.out.println("Launch app");
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com");
	}

	@After
	public void close() throws InterruptedException {
		Thread.sleep(1000);
		driver.close();
		System.out.println("app closed");
	}

	@Test 
	public void login() {
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
	}
	@Test
	public void getCardBoxeTitels() throws InterruptedException {

		List<WebElement> cardTitles = driver.findElements(By.xpath("//*[@class='card-title']"));
//		 List<WebElement>  catalogEntry = driver.findElements(By.xpath("//li[@class='nav-item has-treeview'][2]//ul[@class='nav nav-treeview']//li[@class='nav-item']//a//p"));    
//       System.out.println("*****catalogEntry " + catalogEntry);
////        System.out.println("*****catalogs " + catalogs);  
//        for (WebElement catalog : catalogEntry) {
//        	System.out.println("???? " + catalog.getTagName());
////        	String title = catalog.findElement(By.xpath("/a/p")).getText();
////        	System.out.println("*****catalogs***** " + title);
//        }

		System.out.println("card count: " + cardTitles.size());
		int i = 1;
		for (WebElement cardTitle : cardTitles) {
			String title = cardTitle.getText();
			System.out.println("***** Card Title " + i + " ***** " + title);
			i++;
		}

	}

	@Test
	public void logout() {
		WebElement logout = driver.findElement(By.linkText("Logout"));
		logout.click();
		System.out.println("----------Logout--------------------");
	}

	
}
