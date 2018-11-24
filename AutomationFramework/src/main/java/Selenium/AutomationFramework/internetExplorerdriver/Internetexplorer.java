package Selenium.AutomationFramework.internetExplorerdriver;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Internetexplorer {

	

		@Test
		public void setup() {
		File f = new File("IEDriverServer.exe");
	     //Setting the System Property
	     System.setProperty("webdriver.ie.driver",f.getAbsolutePath());  
	     
		  WebDriver driver = new InternetExplorerDriver();  
		  driver.get("https://www.facebook.com/?_rdr");
		  
		  driver.close();
	
		}
}
