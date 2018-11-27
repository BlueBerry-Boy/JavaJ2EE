package Selenium.AutomationFramework.actionClass;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


		public class Sendkeys {
	
			WebDriver driver = new ChromeDriver();
			
			@BeforeClass
			public void setup() {
				
				File f = new File("chromedriver.exe");
			    System.setProperty("webdriver.chrome.driver",f.getAbsolutePath());  
			     
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				
				String url= "https://www.google.com/?gws_rd=ssl";
				driver.get(url);
			}
				
			@Test
			public void sendKeys() {
			//  driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.F5);
				driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("2018 Mercedes S550");
				driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);	
			//	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.CLEAR);
			//	driver.findElement(By.name("q")).sendKeys(Keys.BACK_SPACE);	
			}
			
			
			@Test
			public void clickonImagelink() {
				
				driver.findElement(By.xpath("//a[contains(text(),'Images')]")).click();
				
			}
			
			@AfterClass
			public void closeTest() {
				driver.quit();
			}
	
	
}