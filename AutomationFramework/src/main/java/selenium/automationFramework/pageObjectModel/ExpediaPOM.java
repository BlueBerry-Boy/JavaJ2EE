package selenium.automationFramework.pageObjectModel;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import selenium.automationFramework.pageObjectModel.PageObjectModel;


	public class ExpediaPOM {

	private WebDriver driver;
	private String baseUrl;
//	static Logger log = Logger.getLogger(TestNG_TestSuite.class);

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com/";
		

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PropertyConfigurator.configure("log4j.properties");
		driver.get(baseUrl);
	}

	@Test
	public void fillBasicInfo() throws Exception {
		PageObjectModel.navigateToFlightsTab(driver);
		PageObjectModel.fillOriginTextBox(driver, "New York");
		PageObjectModel.fillDestinationTextBox(driver, "Chicago");
		PageObjectModel.fillDepartureDateTextBox(driver, "12/25/2015");
		PageObjectModel.fillReturnDateTextBox(driver, "12/31/2015");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	
}
