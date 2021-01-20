package Fotografia;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class tomaFoto1 {

public static void tomarFotografia1(String nombrePaso, WebDriver driver) throws InterruptedException, AWTException, IOException{
		
//        Thread.sleep(2000);		
//		//String nombre_paso = "Se va a página de ejemplo";
//		
//		String formato_foto = ".png";
//		String path_foto = "C:\\Users\\Microsoft Windows 10.DESKTOP-8RBDR0M\\eclipse-workspace\\FotografiasSelenium\\target\\";
//		String Archivo_foto = path_foto + nombrePaso + formato_foto;
//		
//		Robot robot = new Robot();
//		BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
//		ImageIO.write(image, "png", new File(Archivo_foto));		
//		Thread.sleep(5000);		
//		System.out.println("Fotografía Tomada para " + nombrePaso);
        
	    File screenshot;
	    
	    screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("C:\\Users\\Microsoft Windows 10.DESKTOP-8RBDR0M\\eclipse-workspace\\FotografiasSelenium\\target\\" + nombrePaso + "333.png" ));
	}
}
