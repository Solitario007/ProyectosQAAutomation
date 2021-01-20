package TestSelenium;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class SeleniumMaven {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();		
		
		
		driver.get("https://www.hyundai.com.mx/prueba-de-manejo/creta/");
		
		driver.manage().window().maximize();
		
		//*[@id="anchor-modelos-commercials"]
		
		//id anchor-modelos-suvs
		
		SoftAssert softassert = new SoftAssert();
				
		//Thread.sleep(3000);
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement elementoCotizacion = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\'header\']/div[2]/div[2]/ul/li[1]/a"))));
		
		String SolicitaC = driver.findElement(By.xpath("//*[@id=\'header\']/div[2]/div[2]/ul/li[1]/a")).getText();
		
		//Assert.assertEquals(SolicitaC, "Solicitar cotización");
		softassert.assertEquals(SolicitaC, "Solicitar cotizaciónes");
		
		System.out.println("Paso 1 Se encontro la pregunta");
		
		//Assert.assertEquals(true, true);
		softassert.assertEquals(true, false, "No se encontro dicho valor");
		
		System.out.println("Paso 2 Se encontro ");
		
		//Assert.fail("No se encotro el paso 3");
		softassert.fail("No se encotro el paso 3");
		
		System.out.println("Paso 3 Se encontro ");
		
		softassert.assertAll();
		
//		driver.findElement(By.id("anchor-modelos-suvs")).click();
//		Thread.sleep(1000);
//		
////		driver.findElement(By.id("anchor-modelos-cars")).click();
//		Thread.sleep(1000);
//		
//		driver.findElement(By.id("anchor-modelos-commercials")).click();
//		Thread.sleep(1000);
		
		//*[@id="coches-slider"]/div[1]/div/div[13]/div/a[2]
		//*[@id="coches-slider"]/div[1]/div/div[13]/div/a[2]
		driver.findElement(By.xpath("//*[@id=\'coches-slider\']/div[1]/div/div[13]/div/a[2]")).click();
		
	
		Thread.sleep(10000);
		
		driver.switchTo().frame("iFrameResizer0");
		
		Select saludo = new Select(driver.findElement(By.name("saludo")));
		
		saludo.selectByVisibleText("Sra.");
		
		Thread.sleep(2000);		
		
		//nombre	
		driver.findElement(By.name("nombre")).sendKeys("Charlie");
		
		//"E-mail"
		
		driver.findElement(By.xpath("//*[@placeholder='E-mail']")).sendKeys("carlos@gmail.com");
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		driver.close();

	}

}
