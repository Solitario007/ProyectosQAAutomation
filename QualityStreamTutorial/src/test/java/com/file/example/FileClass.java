package com.file.example;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class FileClass {
	
	//private static final CharSequence WebElement = null;
	WebDriver driver;
	
	
//	public void login(String uname, String pwd){
//	     String URL = "http://" + uname + ":" + pwd + "@" + TEST_ENVIRONMENT;
//	     driver.get("https://appserv2ds.personeriabogota.gov.co:8443/toolbox-front/#/login");
//	}


	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();						
	}
	
//	public void SeleccionarPerfil(String Principal) {
//		Select principal = new Select(driver.findElement(cmbo_perfil));
//		perfil.selectByVisibleText(Principal);		
//	}

//	public void SeleccionarPerfil(String Principal) {
//	Select principal = new Select(driver.findElement(By.xpath("*[@id='tipoDestinatario']/div/div[3]/div[2]/ul/li[2]/span")));
//	principal.selectByVisibleText(Principal);		
//	
//	//*[@id="tipoDestinatario"]/div/div[3]/div[2]/ul/li[2]/span
//}

	@Test
	public void test() throws InterruptedException {
		//fail("Not yet implemented");
		
		driver.get("https://appserv2ds.personeriabogota.gov.co:8443/toolbox-front/#/login");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/form/div[1]/span/input")).sendKeys("pruebas2");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/form/div[2]/span/input")).sendKeys("Bogota02");		
		
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/form/div[3]/button/span[2]")).click();	
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		

		driver.switchTo().defaultContent();
        driver.switchTo().frame("external-page");
		
		//Gestion Documentos
        
		driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/div/div[1]/div/div/div/app-menu/ul/li[4]/a/span")).click();
		
		
		//Correspondencia de entrada
		driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/div/div[1]/div/div/div/app-menu/ul/li[4]/ul/li[3]/a/span")).click();		
	
	
		//*[@id="ui-tabpanel-3"]/app-datos-generales/form/div/div[2]/div[1]/div[1]/div/p-checkbox[2]/label
		
		//*[@id="ui-tabpanel-3-label"]/span[2]       
		
		//Datos Genrales
//		 driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-3-label\"]/span[2]")).click();
		 
//		Thread.sleep(4000);
		
		//*[@id="ui-tabpanel-3"]/app-datos-generales/form/div/div[2]/div[1]/div[1]/div/p-checkbox[2]/label
		
		
		//Click Requiere distribucion fisica
		driver.findElement(By.xpath("//*[@id=\"reqDistFisica\"]/div/div[2]/span")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//Click adjuntar documento
		driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-0\"]/app-datos-generales/form/div/div[2]/div[1]/div[1]/div" +
		        "/p-checkbox[2]/div/div[2]")).click();
		
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//		 //Adjuntar documento
//		 driver.findElement(By.xpath("//*[@id=\\\"ui-tabpanel-0\\\"]/app-datos-generales/form/div/div[2]/div[1]/div[1]/div/p-checkbox[2]/div/div[2]")).click();
//		 
//	    //Canal recepción
//		// driver.findElement(By.xpath("//*[@id=\"medioRecepcion\"]/div/div[3]/div[2]/ul/li[3]/span"));
//		 
		 //Tipo de docuemnto 
		 driver.findElement(By.xpath("//*[@id=\"tipologiaDocumental\"]/div/label")).click();
		 driver.findElement(By.xpath("//*[@id=\"tipologiaDocumental\"]/div/div[3]/div[1]/input")).sendKeys("Oficio");
		 driver.findElement(By.xpath("//*[@id=\"tipologiaDocumental\"]/div/div[3]/div[2]/ul/li[1]")).click();
		 
		 
		 //No. folios
		 driver.findElement(By.xpath("//*[@id=\"numeroFolio\"]/span/input")).sendKeys("1");
		 
		 //Asunto
		 driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-0\"]/app-datos-generales/form/div/div[2]/div[6]/div/div/span/textarea")).sendKeys("prueba");
		 
		 //Boton icon siguiente
		 driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/div/div[2]/div/app-radicar-comunicaciones/div/app-task-container/div/div/div[1]/button[1]")).click();
		 
		 //Datos solicitante
		 driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-1-label\"]/span[2]")).click();
		 
		 //Tipo persona
		 driver.findElement(By.xpath("//*[@id=\"tipoPersona\"]/div/div[3]/div[2]/ul/li[1]/span")).click();
		 
		 //Boton icon siguiente
		 driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/div/div[2]/div/app-radicar-comunicaciones/div/app-task-container/div/div/div[1]/button[1]/span[1]")).click();
		 
		 //Dependencia destino
		 //driver.findElement(By.xpath(""))
		 
		 
		 //Tipo destinatario
		 driver.findElement(By.xpath("//*[@id=\"tipoDestinatario\"]/div/div[3]/div[2]/ul/li[2]")).click();
		
		 //Dependencia jerarquica
         driver.findElement(By.xpath("//*[@id=\"sedeAdministrativa\"]/div/div[3]/div[2]/ul/li[1]/span")).click();
         
         //Dependencia Productora
         driver.findElement(By.xpath("//*[@id=\"dependenciaGrupo\"]/div/div[3]/div[2]/ul/li[2]/span")).click();
         
         //Boton agregar
         driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/div/div[2]/div/app-radicar-comunicaciones\" +\r\n"
         		+ "                \"/div/app-task-container/div/div/div[1]/p-tabview/div/div/p-tabpanel[3]/div/app-datos-destinatario/p-panel\" +\r\n"
         		+ "                \"/div/div[2]/div/div/form/div/div[4]/button")).click();
         
         //Boton radicar
         driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/div/div[2]/div/app-radicar-comunicaciones/div/app-task-container/p-card/div/div/div/div/div/div[2]/div/div/button[2]")).click();
         
         
         
         
         
		 
		 
		 
		 
		 
		 //Boton guardar
		 driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/div/div[2]/div/app-radicar-comunicaciones/div/app-task-container/p-card/div/div/div/div/div/div[2]/div/div/button[3]/span[2]")).click();
		 
		 
		 
		 
		
////		driver.findElement(By.xpath("//*[@id=\\\"ui-tabpanel-0\\\"]/app-datos-generales/form/div/div[2]/div[1]/div[1]/div/p-checkbox[2]/div/div[2]")).click();
//		
////		 driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/div/div[2]/div/app-radicar-comunicaciones/div/app-task-container/p-card/div/div/div/div/div/div[2]/div/div/button[3]/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"medioRecepcion\"]/div/label"));
//		driver.findElement(By.xpath("//*[@id=\"tipologiaDocumental\"]/div/label"));
//		driver.findElement(By.xpath("//*[@id=\"numeroFolio\"]/span/input"));
//		driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/div/div[2]/div/app-radicar-comunicaciones/div/app-task-container/div/div/div[2]/div/button/span[2]")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-1-label\"]/span[2]"));
//		driver.findElement(By.xpath("//*[@id=\"tipoPersona\"]/div/label"));
//		driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/div/div[2]/div/app-radicar-comunicaciones/div/app-task-container/div/div/div[1]/button[1]/span[1]")).click();
//		
//		//WebElement text = driver.findElement(By.xpath("//*[@id='tipoDestinatario]/div/label"));
//		//*[@id="ui-tabpanel-2-label"]/span[2]
////		driver.findElement(By.id("tipoDestinatario"));
//		
//		driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-2-label\"]/span[2]"));
//		driver.findElement(By.xpath("*[@id=\"tipoDestinatario\"]/div/div[3]/div[2]/ul/li[2]"));			
//		driver.findElement(By.xpath("*[@id=\"sedeAdministrativa\"]/div/div[3]/div[2]/ul/li[1]/span"));
//		driver.findElement(By.xpath("*[@id=\"dependenciaGrupo\"]/div/div[3]/div[2]/ul/li[2]/span"));
//		driver.findElement(By.xpath("*[@id=\"ui-panel-1-content\"]/div/div/form/div/div[4]/button/span[2]"));
//		
//		driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/div/div[2]/div/app-radicar-comunicaciones/div/app-task-container/p-card/div/div/div/div/div/div[2]/div/div/button[2]/span[2]")).click();
//		
//		
//		driver.findElement(By.xpath("*[@id=\"ticket-rad\"]/p"));
//		
	
	}
	public void testLogin(){
	      driver = new ChromeDriver();
	      login("pruebas2", "Bogota02");
	      //Assert...
	}

	public void login(String pruebas2, String Bogota02) {
		// TODO Auto-generated method stub
//		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/form/div[1]/span/input")).sendKeys("pruebas2");
		//driver.findElement(By.id(pruebas2)).sendKeys(pruebas2);
		
		
		
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/form/div[2]/span/input")).click();
		driver.findElement(By.id(Bogota02)).sendKeys(Bogota02);
	
		
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/form/div[3]/button/span[2]")).click();		
	}

}
