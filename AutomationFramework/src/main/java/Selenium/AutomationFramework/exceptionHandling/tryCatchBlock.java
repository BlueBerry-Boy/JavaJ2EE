package Selenium.AutomationFramework.exceptionHandling;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;

	public class tryCatchBlock {

		try {
			//code block;
		} catch (WebDriverException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

