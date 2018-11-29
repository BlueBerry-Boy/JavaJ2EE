package selenium.automationFramework.controlStatements;




public class Ifelse {

	public static void main(String[] args) {
		
		// if Statement
		
		int month = 11;
		String season;
		
		if	(month == 12 || month == 1 || month == 2)
			season = "winter";
		else if (month == 3 || month == 4 || month == 5)
			season = "Spring";
		else if (month == 6 || month == 7 || month == 8)
			season = "Summer";
		else if (month == 9 || month == 10 || month == 11)
			season = "fall";
		else
			season = "Unknown";
		
		System.out.println("The month is in the " + season + " " + "Season.");
		
	
		
		
	}

}
