package TestSelenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		//----------------------Internet Explorer
		
		System.setProperty("webdriver.ie.driver", "C:\\Drivers\\IEDriverServer.exe");
		DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
        cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		cap.setVersion("9.0");
//        cap.setPlatform(Platform.WIN10);
		
		//---------------------- CHROME
//		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
//		DesiredCapabilities cap = DesiredCapabilities.chrome();
//		ChromeOptions options = new ChromeOptions();
//		
//		options.addArguments("Test-type");
//		options.addArguments("disable-extensions");
//		options.addArguments("--start-maximized");
//		
//		cap.setCapability("chrome.binary", "C:\\Drivers\\chromedriver.exe");
//		cap.setVersion("38.0");
//		cap.setPlatform(Platform.WIN10);
//		cap.setCapability(ChromeOptions.CAPABILITY,options);
//		
//		driver = new RemoteWebDriver(new URL("http://192.168.1.4:4444/wd/hub"),cap);
		
		
		
		//---------------------- FIREFOX
//		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
//		DesiredCapabilities cap = DesiredCapabilities.firefox();
//		cap.setVersion("27.0");
//		//cap.setPlatform(Platform.WIN10);
//		cap.setCapability("marionette", true);
//		
//		
//		
        driver = new RemoteWebDriver(new URL("http://192.168.1.4:4444/wd/hub"),cap);
//		
//		
        driver.get("http://www.youtube.com");
		
		driver.findElement(By.name("search_query")).sendKeys("AC DC");
//		driver.findElement(By.id("search-icon-legacy")).click();
		
	    driver.findElement(By.id("search-btn")).click();
	    
	    
	    
		
		Thread.sleep(5000);
		
		driver.close();


	}

}
