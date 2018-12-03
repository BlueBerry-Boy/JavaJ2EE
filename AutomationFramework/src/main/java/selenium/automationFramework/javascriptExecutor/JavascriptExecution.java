package selenium.automationFramework.javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavascriptExecution {
	
	WebDriver driver;
	
	@Test
	public void jse() {
		
	WebElement toClick = driver.findElement(By.xpath("//xpath expression here"));
	toClick.click();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", toClick);
	
	
	
	
	}
	
}
