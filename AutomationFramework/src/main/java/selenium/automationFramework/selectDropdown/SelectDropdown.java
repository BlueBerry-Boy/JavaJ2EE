package selenium.automationFramework.selectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		WebElement e = driver.findElement(By.id("month"));
		Select month = new Select(e);
		month.selectByVisibleText("Nov");
		System.out.println("There are" +  month.getOptions().size()  + "options");
		
		
		WebElement e1 = driver.findElement(By.id("day"));
		Select day = new Select(e1);
		day.selectByVisibleText("6");
		System.out.println("There are" +  day.getOptions().size()  + "options");
		
		
		WebElement e2 = driver.findElement(By.id("year"));
		Select year = new Select(e2);
		year.selectByVisibleText("1989");
		System.out.println(year.getOptions().size());
			
		driver.close();
	}

}
