package selenium.automationFramework.handlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrames {

	
	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium.ie")).click();
		
		driver.switchTo().defaultContent();
		
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("InternetExplorerDriver")).click();
		
		
		driver.switchTo().defaultContent();
		
		
		driver.switchTo().frame("classFrame");
		
		String expected = "Class InternetExplorerDriver";
		String actual = driver.findElement(By.xpath("//h2[text()='Class InternetExplorerDriver']")).getText();
		
		if(expected.equals(actual))
		{
			System.out.println("The test case has passed");
		}
		
	}
}
