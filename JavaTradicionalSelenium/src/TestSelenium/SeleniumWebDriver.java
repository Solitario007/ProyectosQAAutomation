package TestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumWebDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver;

	//CHROME
//		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
		
	//INTERNET EXPLORER	
        System.setProperty("webdriver.ie.driver", "C:\\Drivers\\IEDriverServer.exe");
        DesiredCapabilities capability = new DesiredCapabilities();
        driver = new InternetExplorerDriver();
		capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        
	//FIREFOX	
//		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
//		driver = new FirefoxDriver();   
		
		
		driver.get("http://www.youtube.com");
		
		driver.findElement(By.name("search_query")).sendKeys("AC DC");
		driver.findElement(By.id("search-icon-legacy")).click();
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
