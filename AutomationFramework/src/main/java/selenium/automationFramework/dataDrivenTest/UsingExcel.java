package selenium.automationFramework.dataDrivenTest;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import selenium.automationFramework.dataDrivenTest.Excelutility;
import selenium.automationFramework.dataDrivenTest.Constants;

public class UsingExcel {

	/**
	 * 1.Set the URL, File Path, & File Name/Excel WorkBook name in the constants class
	 * 2.setup the name of the sheet in line 38 ("IDs")
	 * 3.write the name of the tablename (boundary cells) in line 43 ("Logins")
	 * 
	 */
	
	
	private WebDriver driver;

	@BeforeClass
	public void setUp() throws Exception {
		
		File f = new File("geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", f.getAbsolutePath());
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.URL);
		
//		WebElement e = driver.findElement(By.xpath("/html/body/div/div/div[5]/div/div/div[2]/div/div[2]/div[2]/svg"));
//		if(e.isDisplayed()) {
//			e.click();
//			}
		
		driver.findElement(By.xpath("//span[text()='Learn Now']")).click();
		
		// Tell the code about the location of Excel file
		//File_Name=Sheet Name in Excel workbook
		Excelutility.setExcelFile(Constants.File_Path + Constants.File_Name, "IDs");  
	}
	
	@DataProvider(name = "loginData")
	public Object[][] dataProvider() {
		Object[][] testData = Excelutility.getTestData("Logins");  //  Boundary cell table name
		return testData;
	}

	@Test(dataProvider="loginData")
	public void testUsingExcel(String username, String password) throws Exception {
		// Click login button
		driver.findElement(By.xpath("//div[@id='navbar']//a[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		// Enter username
		driver.findElement(By.id("user_email")).sendKeys(username);
		// Enter password
		driver.findElement(By.id("user_password")).sendKeys(password);
		// Click Login button
		driver.findElement(By.name("commit")).click();
		Thread.sleep(2000);
		
		// Find if error messages exist
		boolean result = driver.findElements(By.xpath("//form[@id='new_user']//div[3]")).size() != 0;
		Assert.assertTrue(result);
	}
	
	@AfterClass
	public void tearDown() throws Exception {
	    //driver.quit();
	}
}
