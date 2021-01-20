package TestATM;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.Platform;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.remote.RemoteWebDriver;

import Impresion.UtilizaFile;
import Page_ATM.Page_ATM_Home;

import java.net.URL;

	public class BrowserStackSampleTest {
	  public static final String USERNAME = "danielpea2";
	  public static final String AUTOMATE_KEY = "dM7FsmYafPCHpSUxCsGf";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	  public static void main(String[] args) throws Exception {
	    DesiredCapabilities caps = new DesiredCapabilities();
	    
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "10");
	    caps.setCapability("browser", "Chrome");
	    caps.setCapability("browser_version", "80");
	    
	    caps.setCapability("name", "danielpea2's First Test");
	    
	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//	    driver.get("http://www.google.com");
	    driver.get("http://www.atestermate.com/AutomationExample.php");

		
		UtilizaFile imprimeEvidencia = new UtilizaFile();
		
		//Se instancia o llama a Page_ATM_Home
		Page_ATM_Home phome = new Page_ATM_Home();
		
		WebDriver driver1;		
////		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
////		driver = new ChromeDriver();
		    
		
		DesiredCapabilities caps1 = new DesiredCapabilities();
        
		caps1.setCapability("os", "Windows");
		caps1.setCapability("os_version", "10");
		caps1.setCapability("browser", "Chrome");
		caps1.setCapability("browser_version", "80");
		caps1.setCapability("name", "danielpea2's First Test");
		
		
		//driver = new RemoteWebDriver(new URL(URL), caps);
		
		driver1 = new RemoteWebDriver(new URL(URL), caps1);
		
		driver1.get("http://www.atestermate.com/AutomationExample.php");
		
//		driver.manage().window().maximize();
		
		//Se llaman los métodos
		phome.IniciaDriver(driver1);
		imprimeEvidencia.InicializaFile();
		driver.manage().window().maximize();
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
		phome.FinalizaDriver(driver1);		
//		imprimeEvidencia.GeneraEvidencia("CasoDePrueba1.docx");
	  }
	}

