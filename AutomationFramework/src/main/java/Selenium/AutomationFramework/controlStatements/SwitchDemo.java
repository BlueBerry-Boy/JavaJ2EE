package Selenium.AutomationFramework.controlStatements;

public class SwitchDemo {

	public static void main(String[] args) {
		
		// Switch Statement
		
		
		int y = 3;
		
		for (int x=0; x<y; x++)
		{
			System.out.println(x);
		}
		
		switch (y) {
			
			case 0:
				System.out.println(" The Loop is initiated");
				break;
				
			case 1:
				System.out.println("This is number one");   
				break;
					
			case 2:
				System.out.println("This is number Two");
				break;
				
			case 3:
				System.out.println("This is number Three");
				break;
				
			case 12:
				System.out.println("Here is the equivalent match");
				break;
				
			default:
				System.out.println("Oops! There is an Error");
				break;
		}

	
//		for (int c=0; c<6; c++)
//		{
//			System.out.println(c);
//		}
		
	}

}
