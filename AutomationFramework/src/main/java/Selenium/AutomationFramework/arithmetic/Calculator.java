package Selenium.AutomationFramework.arithmetic;

public class Calculator {

	public int calc(int a, int b) {
	
		int c;
		{
			 c= a + b;
		}
		
		return c;
}	
	
		
	public static void main(String[] args) {

		Calculator add = new Calculator();
		
		int Result= add.calc(34, 56);
		
		System.out.println("The Answer is" + " " + Result);
		
		
	}

}
