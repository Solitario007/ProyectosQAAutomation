package TestATM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.NoSuchElementException;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page_ATM.Page_ATM_HomePFactory;



public class TestExec2 {
	
	public static void main (String args[]) throws AWTException, InterruptedException {
		
		Robot robot = new Robot();
		
		//Se instancia o llama a Page_ATM_Home
		Page_ATM_HomePFactory phome = new Page_ATM_HomePFactory();
		
		WebDriver driver;		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.atestermate.com/AutomationExample.php");
		
		driver.manage().window().maximize();
		//Se llaman los métodos
		phome.IniciaDriver(driver);
		
		try 
		{
		phome.EscribeEmail("Charlie.Garcia@mail.com");
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(4000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(4000);
		phome.EscribePassword("Password123456");
		Thread.sleep(4000);
		
		//Otra forma de usar teclado sin robot
		driver.findElement(By.id("nPassword")).sendKeys(Keys.ENTER);
		
//		//robot presiona la tecla Alt
//		robot.keyPress(KeyEvent.VK_ALT);
//		//Combinando teclas
//		robot.keyPress(KeyEvent.VK_F4);;
//		
//		//Suelta las teclas
//		robot.keyRelease(KeyEvent.VK_ALT);
//		robot.keyRelease(KeyEvent.VK_F4);
//		Thread.sleep(4000);
//		phome.EscribePassword("Password123456");

		
		phome.SeleccionarPerfil("Test Manager");
		phome.ClickEnExperiencia(15);
		phome.RegistraUsuario();
		
		}
		catch(NoSuchElementException e) {
			System.out.println("El elemento no fue encontrado el detalle es:");
			System.out.println(e);
		}
		phome.FinalizaDriver(driver);		
		
	}

}
