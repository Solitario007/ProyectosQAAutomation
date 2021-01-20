package ATesterMate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class JavaTest2 extends WebDriverListenerTest{

	public static void main(String[] args) throws InterruptedException, ATUTestRecorderException {
		// TODO Auto-generated method stub
		
		ATUTestRecorder grabaVideo;
	    WebDriver driver= null;
		
		System.setProperty("webdriver.edge.driver", "C:\\Drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		
		EventFiringWebDriver EFWdriver = new EventFiringWebDriver(driver);
		
		WebDriverListenerTest weblistener = new WebDriverListenerTest();
		
		EFWdriver.register(weblistener);
		
		grabaVideo = new ATUTestRecorder("C:\\Users\\Microsoft Windows 10.DESKTOP-8RBDR0M\\eclipse-workspace\\Selenium0\\Videos\\", "EvidenciaDeVideo", false);
		
		grabaVideo.start();
		
		EFWdriver.get("http://www.atestermate.com/AutomationExample.php");
		
		EFWdriver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		EFWdriver.findElement(By.name("nEmail")).sendKeys("charlie.garcia@terstermate.com");
		EFWdriver.findElement(By.id("nPassword")).sendKeys("12345");
		EFWdriver.findElement(By.name("nsubmit")).click();
		EFWdriver.close();
		
		grabaVideo.stop();
		
		System.out.println("Se termino la prueba!");
		

	}

}
