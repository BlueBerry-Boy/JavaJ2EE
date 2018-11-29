package selenium.automationFramework.arithmetic;

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
		
		int Result= add.calc(50, 50);
		
		System.out.println("The Answer is" + " " + Result);
		
		
	}

}
