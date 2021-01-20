package TestOnSikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class SikuliTestClass {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Screen src = new Screen();	
		
		
		driver.get("http://www.google.com");
		
        Thread.sleep(4000);
		
		src.click("C:\\Images\\botonIniciarsesion.png");
		
		Thread.sleep(4000);
		
	}

}
