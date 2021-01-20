package PasosScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Metodos1 {
	
	WebDriver driver;
	
	@Given("^Abrir el navegador y la pagina$")
	public void abrir_el_navegador_y_la_pagina() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.get("http://www.atestermate.com/AutomationExample.php");
	    System.out.println("Se abre la pagina y el navegador");
	}

	@Given("^una vez que se abra dar el usuario y password y hacer login$")
	public void una_vez_que_se_abra_dar_el_usuario_y_password_y_hacer_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("Se escribe usuario y password");
	}

	@When("^Se inicia sesion$")
	public void se_inicia_sesion() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Se inicia sesión");
	}

	@When("^y realizar una accion$")
	public void y_realizar_una_accion() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Se realiza una acción");
	}

	@When("^validas	otra accion$")
	public void validas_otra_accion() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Se valida otra acción");
	}

	@Then("^Cuando termines de validar$")
	public void cuando_termines_de_validar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Se termina de validar");
	}

	@Then("^Realiza log out$")
	public void realiza_log_out() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Se realiza log out");
	}

	@Given("^I want to write a step with name(\\d+)$")
	public void i_want_to_write_a_step_with_name(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I check for the (\\d+) in step$")
	public void i_check_for_the_in_step(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I verify the success in step$")
	public void i_verify_the_success_in_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I verify the Fail in step$")
	public void i_verify_the_Fail_in_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Given("^Escribe el password \"([^\"]*)\"$")
	public void escribe_el_password(String param_password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();		
		driver.findElement(By.id("nPassword")).sendKeys(param_password);
		System.out.println("Se escribe el password");
		
	}

	@When("^Se registra usuario$")
	public void se_registra_usuario() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions	    
	    driver.findElement(By.name("nsubmit")).click();
	    System.out.println("Se registra usuario");
	}

	@Then("^Cierra el navegador$")
	public void cierra_el_navegador() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.close();
		System.out.println("Se cierra el navegador");
	}
	
	@Given("^Una vez que se abra escribir el email	\"([^\"]*)\"$")
	public void una_vez_que_se_abra_escribir_el_email(String param_email) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("nEmail")).sendKeys(param_email);
	    System.out.println("Se escribe el email");
	}
}
