import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= null;
		
		System.setProperty("webdriver.edge.driver", "C:\\Drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("http://www.atestermate.com/AutomationExample.php");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("nEmail")).sendKeys("charlie.garcia@terstermate.com");
		driver.findElement(By.id("nPassword")).sendKeys("12345");
		driver.findElement(By.name("nsubmit")).click();
		driver.close();
		
		System.out.println("Se termino la prueba!");
		

	}

}
