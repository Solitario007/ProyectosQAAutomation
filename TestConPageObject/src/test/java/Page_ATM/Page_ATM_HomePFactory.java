package Page_ATM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Page_ATM_HomePFactory {
	
    WebDriver driver;
    
  //Se identifican los elementos para realizar la automatización
    
    @FindBy(name = "nEmail") WebElement pf_email;
    @FindBy(id = "nPassword") WebElement pf_password;
    @FindBy(name = "nsubmit") WebElement pf_btn_submit;
    @FindBy(name = "profile") WebElement pf_perfil;
    @FindBy(id = "oneyears") WebElement pf_experiencia1;
    @FindBy(id = "twoyears") WebElement pf_experiencia2;
    @FindBy(id = "moreyears") WebElement pf_experiencia3;	
	
	
	//Luego se crean los métodos
	public void IniciaDriver(WebDriver driver){		
		//this.driver = driver;		
		PageFactory.initElements(driver, this); 
	}
	
	public void FinalizaDriver(WebDriver driver){		
		driver.close();	
		
	}
	
	public void EscribeEmail(String email) {
		pf_email.sendKeys(email);
	}
	
	public void EscribePassword(String password) {
		pf_password.sendKeys(password);
	}
	
	public void SeleccionarPerfil(String Perfil) {
		Select perfil = new Select(pf_perfil);
		perfil.selectByVisibleText(Perfil);		
	}
	
	
	public void ClickEnExperiencia(Integer experiencia) {
		
		if(experiencia == 1) {
			pf_experiencia1.click();
		}
		if(experiencia == 2) {
			pf_experiencia2.click();
		}
		if(experiencia >= 3) {
			pf_experiencia3.click();
		}		
		
	}
	
	public void RegistraUsuario() {		
		
		pf_btn_submit.click();
		
	}	
	

}
