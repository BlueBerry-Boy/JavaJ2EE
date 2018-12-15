package selenium.automationFramework.chromedriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

		public class Chromedriver {
			
/**
 * Or Use local path in pc folders:
 * System.setProperty("webdriver.chrome.driver","/Users/path/Documents/path/libs/chromedriver");
 * 			
 */
			
				 @BeforeClass
				 public void setup() {		
			   	 File f = new File("chromedriver.exe");
			     System.setProperty("webdriver.chrome.driver",f.getAbsolutePath());
			     
			     WebDriver driver = new ChromeDriver();
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				 driver.manage().window().maximize();
					 
				 String url= "https://www.google.com/?gws_rd=ssl";
				 driver.get(url);  
				 }
				 
				 @Test(priority=0)
				 public void googleHomePage() {	 
				 WebDriver driver = new ChromeDriver();
				 String Actual = driver.getCurrentUrl();
				// String Expected= "https://www.google.com/?gws_rd=ssl";
				 
				// Assert.assertEquals(Actual, Expected);
				 System.out.println( "The URL for this site is " + Actual);		
				 }
					
				@Test(priority=1)
				public void close() {
				WebDriver driver = new ChromeDriver();
				driver.close();
				}
				 
				@AfterClass
				public void teardown() {
				WebDriver driver = new ChromeDriver();
				driver.quit();	
			}
				 
	}
