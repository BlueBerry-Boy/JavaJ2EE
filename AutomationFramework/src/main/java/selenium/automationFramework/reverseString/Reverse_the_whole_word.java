package selenium.automationFramework.reverseString;

import org.testng.annotations.Test;

public class Reverse_the_whole_word {
	
	
	
	@Test
	public void reverseTheWholeword() {
		String s = "Bank";
		String t = "";
					
		for(int i=s.length()-1; i>=0; i--)
		{
			t= t + s.charAt(i);
		}
		
		System.out.println(t);
	}

}
