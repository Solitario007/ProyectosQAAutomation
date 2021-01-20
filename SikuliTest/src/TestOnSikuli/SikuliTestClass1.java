package TestOnSikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class SikuliTestClass1 {

	public static void main(String[] args) throws FindFailed, InterruptedException {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			Screen src = new Screen();	
			
			
			driver.get("https://www.hyundai.com.mx/#home/1");
			
	        Thread.sleep(4000);
			
			src.click("C:\\Images\\SolicitaCot.png");
			
			Thread.sleep(4000);
			
            src.click("C:\\Images\\seleccionar.png");
			
			Thread.sleep(4000);
			
            src.click("C:\\Images\\creta1.png");
			
			Thread.sleep(8000);
			
			src.type("C:\\Images\\cp.png", "25000");
			

	}

}
