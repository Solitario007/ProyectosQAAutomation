package Fotografia;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropClass {
	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		// TODO Auto-generated method stub
		

		WebDriver driver;		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		try
		{
		
		//Las acciones permiten realizar diversos eventos con el mouse
		
		Actions acciones  = new Actions(driver);
		
		Thread.sleep(5000);
		
		acciones.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		
		//acciones.dragAndDrop(driver.findElement(By.xpath("//*[@id='draggable']")),driver.findElement(By.xpath("//*[@id='droppable']"))).build().perform();
			
		Thread.sleep(5000);
		
		//acciones.dragAndDrop(driver.findElement(By.className("ui-widget-content ui-draggable ui-draggable-handle")), driver.findElement(By.className("ui-widget-header ui-droppable ui-state-highlight"))).build().perform();
				
				
		}catch(NoSuchElementException e) {
			System.out.println("No se encuentra elemento"); 
			System.out.println(e);
		}
		
		driver.close();

	}

	
}
