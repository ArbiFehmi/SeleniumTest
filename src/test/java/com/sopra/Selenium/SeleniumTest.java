package com.sopra.Selenium;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@SuppressWarnings("deprecation")
	@Test
	public void test1() throws InterruptedException {

		Thread.sleep(1000);

		driver.get("https://www.amazon.es");
		driver.manage().window().setSize(new Dimension(1296, 696));
//		driver.findElement(By.id("twotabsearchtextbox")).click();
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nint");
//		driver.findElement(By.cssSelector("div:nth-child(1) > .s-suggestion-container > .s-suggestion")).click();
		Thread.sleep(1000);
//		assertThat(driver.getTitle(), is("Amazon.es : nintendo switch"));
//		{
//			List<WebElement> elements = driver.findElements(By.id("a-autoid-0-announce"));
//			assert (elements.size() > 0);
//		}
	}
}
