package Selenium.AutomationFramework.actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover {

	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		Actions action = new Actions(driver);
		WebElement HoverLink = driver.findElement(By.linkText("value"));
		action.moveToElement(HoverLink);
		action.perform();
	
	}

}
