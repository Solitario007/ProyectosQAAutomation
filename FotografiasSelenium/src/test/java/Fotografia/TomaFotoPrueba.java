package Fotografia;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TomaFotoPrueba {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver;		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://www.atestermate.com/AutomationExample.php");
		
		tomaFoto.tomarFotografia("Abre Página Principal");	
		
		driver.findElement(By.name("nEmail")).sendKeys("EmailUsuario@email.com");
		
		tomaFoto.tomarFotografia("Captura Email");
		
       	driver.findElement(By.id("nPassword")).sendKeys("Password123456");
		tomaFoto.tomarFotografia("EscribePassword");	
		
//		Thread.sleep(5000);
//		
//		String nombre_paso = "Se Abre Página";
//		String formato_foto = ".png";
//		String path_foto = "C:\\Users\\Microsoft Windows 10.DESKTOP-8RBDR0M\\eclipse-workspace\\FotografiasSelenium\\target\\";
//		String Archivo_foto = path_foto + nombre_paso + formato_foto;
//		
//		Robot robot = new Robot();
//		BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
//		ImageIO.write(image, "png", new File(Archivo_foto));
		
//		Thread.sleep(3000);
		
//		driver.get("http://www.atestermate.com/AutomationExample.php");
//		
//		Thread.sleep(5000);
		
		
//		nombre_paso = "Se va a página de ejemplo";
//		Archivo_foto = path_foto + nombre_paso + formato_foto;
//		
//		robot = new Robot();
//		image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
//		ImageIO.write(image, "png", new File(Archivo_foto));
//		
//		Thread.sleep(5000);
		
		driver.close();

	}

}
