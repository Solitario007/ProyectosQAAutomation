package Page_ATM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Command;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.Response;
import org.openqa.selenium.support.ui.Select;

//esta clase contine todos los objetos correspondientes que se van a utilizar para automatizar una página
public class Page_ATM_Home {
	
	WebDriver driver;
	
	//Se identifican los elementos para realizar la automatización
	
	By txt_email = By.name("nEmail");
	By txt_password = By.id("nPassword");
	By btn_submit = By.name("nsubmit");
	By cmbo_perfil = By.name("profile");
	By chbx_experiencia3 = By.id("moreyears");
	By chbx_experiencia1 = By.id("oneyears");
	By chbx_experiencia2 = By.id("twoyears");
	
	
	
	//Luego se crean los métodos
	public void IniciaDriver(WebDriver driver){
		
		this.driver = driver;		
	}
	
	public void FinalizaDriver(WebDriver driver){
		
		driver.quit();	
		
	}
	
	public void EscribeEmail(String email) {
		driver.findElement(txt_email).sendKeys(email);
	}
	
	public void EscribePassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void SeleccionarPerfil(String Perfil) {
		Select perfil = new Select(driver.findElement(cmbo_perfil));
		perfil.selectByVisibleText(Perfil);		
	}
	
	
	public void RegistraUsuario() {		
		
		driver.findElement(btn_submit).click();
		
	}	
	
	public void ClickEnExperiencia(Integer experiencia) {
		
		if(experiencia == 1) {
			driver.findElement(chbx_experiencia1).click();
		}
		if(experiencia == 2) {
			driver.findElement(chbx_experiencia2).click();
		}
		if(experiencia >= 3) {
			driver.findElement(chbx_experiencia3).click();
		}		
		
		
		}
		
	}


