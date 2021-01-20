package com.qualitystream.tutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.interactions.SendKeysAction;

public class MercuryTours_AutomatedTest {
	
	private WebDriver driver;
	By registerLinkLocator = By.linkText("REGISTER");
	By registerPageLocator = By.xpath("//img[@src='/images/mast_register.gif']");
	By usernameLocator = By.id("email");
	By passwordLocator = By.name("password");
	By confirmPasswodLocator = By.cssSelector("input [name='confirmPassword']");
	By registerBtnLocator = By.name("register");
	
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/");	
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void registrerUser() throws InterruptedException {
		//fail("Not yet implemented");
		driver.findElement(registerLinkLocator).click();
		Thread.sleep(2000);
		if(driver.findElement(registerPageLocator).isDisplayed()) {
			driver.findElement(usernameLocator).sendKeys("qualityadmin");
			driver.findElement(passwordLocator).sendKeys("pass1");
			driver.findElement(confirmPasswodLocator).sendKeys("pass1");
			driver.findElement(registerBtnLocator).click();
		}
		else {
			System.out.print("Register pages was not found");
		}
		
	}

}
