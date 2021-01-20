package TestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestAngular {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();		
		
		
		driver.get("https://material.angular.io/components/select/overview");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("mat-select-10")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("mat-option-19")).click();
	
		Thread.sleep(2000);
		
		
		driver.close();

	}

}

