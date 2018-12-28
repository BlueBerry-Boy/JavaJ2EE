package selenium.automationFramework.exceptionHandling;

import java.io.IOException;

import org.openqa.selenium.WebDriverException;
import org.testng.annotations.Test;

	public class tryCatchBlock {
		
		@Test
		public void exceptionhandling() {

		try {
			//code block;
		} catch (WebDriverException e) {
			e.printStackTrace();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		try {
			
		}catch (Exception e) {
			e.printStackTrace();	
		}
		
			
	}	
}	


