package selenium.automationFramework.webDriverManager;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



/**
 * https://github.com/bonigarcia/webdrivermanager
 * 
 */


/**
 * The setups
 * WebDriverManager.chromedriver().setup();
WebDriverManager.firefoxdriver().setup();
WebDriverManager.operadriver().setup();
WebDriverManager.phantomjs().setup();
WebDriverManager.edgedriver().setup();
WebDriverManager.iedriver().setup();
 */

	public class WebdriverManagerClass {
	
		private WebDriver driver;
		
		@BeforeClass
		public static void Webdrivermanager() {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
		}
			
		
		
	

}
