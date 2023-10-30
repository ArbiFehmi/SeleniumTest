package com.sopra.Selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TEST3 {
	WebDriver driver;

	@Before
	public void lauunch() {
		System.out.println("Launch app");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
	}

	@After
	public void close() throws InterruptedException {
		Thread.sleep(1000);
		driver.close();
		System.out.println("app closed");
	}

	@Test
	public void getGoogleLinks() throws InterruptedException {
		WebElement form = driver.findElement(By.id("userForm"));
		WebElement submitBtn = driver.findElement(By.id("submit"));

		submitBtn.click();

	}

}
