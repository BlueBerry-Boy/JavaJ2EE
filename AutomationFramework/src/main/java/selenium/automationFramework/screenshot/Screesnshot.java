package selenium.automationFramework.screenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


	public class Screesnshot {

		@Test
		public void takeScreenshot() {
			
			WebDriver driver = new ChromeDriver();
			
			TakesScreenshot tsh = (TakesScreenshot)driver;
			
			try {
				FileHandler.copy(tsh.getScreenshotAs(OutputType.FILE), new File("C:\\picture.jpg"));
			} catch (WebDriverException e) {
				
				//e.printStackTrace();
			} catch (IOException e) {
				
			//	e.printStackTrace();
			}
	
		}

}


public class ScreenshotUtils {

	/**
	 * screenshot - Takes screenshot using Robot Class
	 * @param folderPath
	 * @param counter
	 */
	public static void screenshot(String folderPath, int counter){
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();
		Rectangle screenRect = new Rectangle(screenSize);
		
		Robot robot = null;
	try {
		 robot = new Robot();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	String sCounter = "0000"+String.valueOf(counter);
	sCounter = sCounter.substring(sCounter.length()-4,sCounter.length());
	
	
	// Save captured image
	BufferedImage image = robot.createScreenCapture(screenRect);
	

	File dir = new File(folderPath);
	if(!dir.exists())
	dir.mkdirs();
	 
	try {
		ImageIO.write(image, "jpg", new File(folderPath+ "/screenShot"+sCounter+".jpg"));
	} catch (IOException e) {
 		e.printStackTrace();
	}
	
	System.out.println("Screenshot is captured @ "+folderPath+ "/screenShot"+sCounter+".jpg");
	
	}

}
