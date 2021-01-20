package Fotografia;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TomaFotoPrueba1 {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		// TODO Auto-generated method stub
		

		WebDriver driver;		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://www.atestermate.com/AutomationExample.php");
		
		tomaFoto1.tomarFotografia1("Abre Página Principal", driver);	
		
		driver.findElement(By.name("nEmail")).sendKeys("EmailUsuario@email.com");
		
		tomaFoto1.tomarFotografia1("Captura Email", driver);
		
       	driver.findElement(By.id("nPassword")).sendKeys("Password123456");
		tomaFoto1.tomarFotografia1("EscribePassword", driver);	
		
	
		driver.close();

	}

}
