package selenium.automationFramework.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




	public class PageObjectModel {
	
		// Expedia.com Home Page
		
		public static WebElement element = null;
		
		/**
		 * Returns the flight origin text box element
		 * @param driver
		 * @return
		 */
		public static WebElement originTextBox(WebDriver driver) {
			element = driver.findElement(By.id("flight-origin"));
			return element;
		}
		
		public static void fillOriginTextBox(WebDriver driver, String origin) {
			element = originTextBox(driver);
			element.sendKeys(origin);
		}

		/**
		 * Returns the flight destination text box element
		 * @param driver
		 * @return
		 */
		public static WebElement destinationTextBox(WebDriver driver) {
			element = driver.findElement(By.id("flight-destination"));
			return element;
		}

		/**
		 * Fills the destinationTextBox
		 * @param driver 
		 * 
		 */
		
		public static void fillDestinationTextBox(WebDriver driver, String Destination) {
			element = destinationTextBox(driver);
			element.sendKeys(Destination);
		}
		
		
		/**
		 * Returns the departure date text box element
		 * @param driver
		 * @return
		 */
		public static WebElement departureDateTextBox(WebDriver driver) {
			element = driver.findElement(By.id("flight-departing"));
			return element;
		}

		/**
		 * Fills the departure date Text
		 * @param DepartureDate
		 */
		public static void fillDepartureDateTextBox(WebDriver driver, String DepartureDate ) {
			element = departureDateTextBox(driver);
			element.sendKeys(DepartureDate);
			
		}
		
		/**
		 * Returns the return date text box element
		 * @param driver
		 * @return
		 */
		public static WebElement returnDateTextBox(WebDriver driver) {
			element = driver.findElement(By.id("flight-returning"));
			return element;
		}

		
		/**
		 * Fills the Return Date text Box Element
		 * 
		 */
		public static void fillReturnDateTextBox(WebDriver driver, String ReturnDate) {
			element = returnDateTextBox(driver);
			element.sendKeys(ReturnDate);
		}
		
		
		
		/**
		 * Returns the search button box element
		 * @param driver
		 * @return
		 */
		public static WebElement searchButton(WebDriver driver) {
			element = driver.findElement(By.id("search-button"));
			return element;
		}

		/**
		 * Click on search button
		 * @param driver
		 */
		public static void clickOnSearchButton(WebDriver driver) {
			element = searchButton(driver);
			element.click();
		}
		
		/**
		 * Navigate to flights tab
		 * @param driver
		 */
		public static void navigateToFlightsTab(WebDriver driver) {
			driver.findElement(By.id("header-history")).click();
			element = driver.findElement(By.id("tab-flight-tab"));
			element.click();
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
