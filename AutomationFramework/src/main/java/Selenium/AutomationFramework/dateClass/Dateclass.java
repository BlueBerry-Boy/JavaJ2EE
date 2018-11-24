package Selenium.AutomationFramework.dateClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateclass {

	public static void main(String[] args) throws Exception {
		
		Date d1 = new Date(); 
		System.out.println(d1);
	
		
		// Parse Date into string
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String datestr = "01/11/2018";
		sdf.parse(datestr);	
		
		Date D2 = sdf.parse(datestr);
		
		System.out.println("The formatted date is :" + D2);
		
	}

}


