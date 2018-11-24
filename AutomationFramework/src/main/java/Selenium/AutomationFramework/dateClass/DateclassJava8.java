package Selenium.AutomationFramework.dateClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateclassJava8 {

	public static void main(String[] args) throws Exception {
		
		// the method below will return the current date in format yyyy-MM-dd  (.now)
		LocalDate d = LocalDate.now();
		System.out.println("Todays date is: " + d);
		
		
		//Formatting the Date:  (using .of() method)
		//LocalDate d = LocalDate.of(year, Month.OCTOBER, dayOfMonth);
		
		LocalDate todate = LocalDate.of(2018, Month.NOVEMBER, 01);
		System.out.println("The Formatted date using .of() method is:" + todate);
		
		
		//LocalTime
		
		LocalTime t = LocalTime.now();  // hour:mins:secs:millisecs
		System.out.println("The Local time now is: " + t);
		
	/**	
		//LocalTime with Time Zones
		//1.Retrieve the Time Zones:
		for (String z : ZoneId.getAvailableZoneIds())
		{
			System.out.println(z);
		}
	*/
		
		//2.Print LocalTime with Time Zones
		 
		LocalTime lt = LocalTime.now(ZoneId.of("US/Central"));
		System.out.println("The Local timezone is: " + lt);
	
		
		//3. How to Format the Date
		
		LocalDateTime localdate = LocalDateTime.now();
		System.out.println("The LocalDateTime is: " + localdate);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM-dd-yy");
		System.out.print(dtf.format(localdate));	
		
		//DateTimeFormatter.ofPattern("MMMM/dd/yyyy"); = November/02/2018
		//DateTimeFormatter.ofPattern("MM/dd/yyyy"); = 11/02/2018
		//DateTimeFormatter.ofPattern("MM/d/yyyy"); = 11/2/2018
		//DateTimeFormatter.ofPattern("MM.dd.yyyy"); = 11.02.18
		//DateTimeFormatter.ofPattern("MMM-dd-yy"); = Nov-02-18
		
		
		
		
		
	}

}
