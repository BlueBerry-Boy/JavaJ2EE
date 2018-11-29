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


	public class Screesnshot {

		@Test
		public void takeScreenshot() {
			
			WebDriver driver = new ChromeDriver();
			
			TakesScreenshot tsh = (TakesScreenshot)driver;
			
			try {
				FileHandler.copy(tsh.getScreenshotAs(OutputType.FILE), new File("C:\\h2kinfosyshomepage.jpg"));
			} catch (WebDriverException e) {
				
				//e.printStackTrace();
			} catch (IOException e) {
				
			//	e.printStackTrace();
			}
	
		}

}
