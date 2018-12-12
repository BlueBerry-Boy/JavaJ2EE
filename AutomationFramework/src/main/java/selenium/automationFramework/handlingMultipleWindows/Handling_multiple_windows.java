package selenium.automationFramework.handlingMultipleWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_multiple_windows {

	public static void main(String[] args) {
		
	FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/?_rdr");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Cookie Use")).click();
		
		String Homepage = driver.getWindowHandle();
		Set<String> page2 = driver.getWindowHandles();
		
		for(String child : page2)
			if(!(Homepage.equals(child)))
				driver.switchTo().window(child);
		
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Network Advertising Alliance")).click();
		
		
		String parentpage2 = driver.getWindowHandle();
		Set<String> page3 = driver.getWindowHandles();
		
		for(String child2 : page3)
			if(!(parentpage2.equals(child2)))
				driver.switchTo().window(child2);
		
		driver.manage().window().maximize();
		driver.findElement(By.linkText("FAQ on Non-Cookie Technologies")).click();	
			
	}

}
