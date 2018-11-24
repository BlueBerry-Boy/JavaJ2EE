package automation_frameworkNG;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



/*
 * This Exception happens when you try to click on an element & it fails to click
 */


public class ElementNotclickableatPointException {

	// Use an Explicit wait to identify the 'invisible' element that's preventing you from clicking the object you want.
	// Element is loaded in DOM but it is overlapped by another element
	// Element is not visible because of another element
	
			@Test
			public void howtoHandleExceptionNotClickable() {
			
			WebDriver driver = new ChromeDriver();
			WebDriverWait wait = new WebDriverWait(driver, 3);
		
			//use the variable invisible to find the element in the exception not clickable
			
			boolean invisible = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("insert id here")));
		
			// Now use an if statement to define the condition of the element that you want to click on
		
			if(invisible) {
				WebElement toClick = driver.findElement(By.xpath("//xpath expression here"));
				toClick.click();
				}
			
			// You can also use a Javascript Executor to click on the element
			
			WebElement toClick = driver.findElement(By.xpath("//xpath expression here"));
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", toClick);
			
		
		}
	
	
}
	
	
	
