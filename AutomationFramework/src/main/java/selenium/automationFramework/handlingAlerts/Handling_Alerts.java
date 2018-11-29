package selenium.automationFramework.handlingAlerts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Alerts {

	public static void main(String[] args) throws InterruptedException, WebDriverException, IOException {
			
			FirefoxDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("http://ksrtc.in/");
			driver.manage().window().maximize();
			
			Thread.sleep(5000);
			driver.findElement(By.cssSelector(".button1.redbtn>font")).click();
			Thread.sleep(5000);
			
			Alert alert = driver.switchTo().alert();
			String popup = alert.getText();
			
			System.out.println(popup);
			
			alert.accept();
	//		alert.dismiss();
			
			driver.close();
	
		}
	
}
