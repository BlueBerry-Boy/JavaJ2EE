package selenium.automationFramework.dateClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateclass {

	public static void main(String[] args) throws Exception {
		
		Date d1 = new Date(); 
		System.out.println(d1);
	
		
		// Parse Date into string
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String datestr = "01/21/2028";
		
		sdf.parse(datestr );	
		Date D2 = sdf.parse(datestr);
		System.out.println("The formatted date is :" + D2);
	
		
		//after method -Returns true if object contains a date that is later than the one specified by date

		System.out.println("is d1 after D2? " + d1.after(D2));
		
		//before method - Returns true if object contains a date that is earlier than the one specified by date
		
		System.out.println("is d1 before D2? " + d1.before(D2));
		
		//compare method
		d1.compareTo(D2);
		
		// toString converts date object into a String
		d1.toString();
		
	}

}


