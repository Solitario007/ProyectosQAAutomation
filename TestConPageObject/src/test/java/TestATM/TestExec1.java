package TestATM;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import Impresion.UtilizaFile;
import Page_ATM.Page_ATM_Home;

public class TestExec1 {
		
	public static final String USERNAME = "danielpea2";
	public static final String AUTOMATE_KEY = "dM7FsmYafPCHpSUxCsGf";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
		
	public static void main (String args[]) throws HeadlessException, InvalidFormatException, IOException, AWTException, InterruptedException {
		
		
//		Robot robot = new Robot();
		
		UtilizaFile imprimeEvidencia = new UtilizaFile();
		
		//Se instancia o llama a Page_ATM_Home
		Page_ATM_Home phome = new Page_ATM_Home();
		
		WebDriver driver;		
////		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
////		driver = new ChromeDriver();
		    
		
		DesiredCapabilities caps = new DesiredCapabilities();
        
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "80");
		caps.setCapability("name", "danielpea2's First Test");
		
		
		//driver = new RemoteWebDriver(new URL(URL), caps);
		
		driver = new RemoteWebDriver(new URL(URL), caps);
		
		driver.get("http://www.atestermate.com/AutomationExample.php");
		
		
		
//		driver.manage().window().maximize();
		
		//Se llaman los métodos
		phome.IniciaDriver(driver);
		imprimeEvidencia.InicializaFile();
		phome.EscribeEmail("Charlie.Garcia@mail.com");
		
	
		imprimeEvidencia.PasoDelScript("1. Escribe el usuario Charlie.Garcia@mail.com");
		Thread.sleep(10000);
		phome.EscribePassword("Password123456");		
		//Thread.sleep(4000);
		
//		imprimeEvidencia.PasoDelScript("2. Escribe el password Password 12345");
//		phome.SeleccionarPerfil("Test Manager");
//		imprimeEvidencia.PasoDelScript("3. Seleccionar el perfil Test Manager");
//		phome.ClickEnExperiencia(15);
		imprimeEvidencia.PasoDelScript("4. Selecciona los años de experiencia");
		phome.RegistraUsuario();
		imprimeEvidencia.PasoDelScript("5. Da click en Crear Usuario");
		phome.FinalizaDriver(driver);		
		imprimeEvidencia.GeneraEvidencia("CasoDePrueba1.docx");
		
	}

	
	
}
