package selenium.automationFramework.reverseString;

public class StringClassMethods {

	public static void main(String[] args) {
		/**
		 * We are going to see some uses of the methods in the string class
		 * 
		 **/
		
		String a = "Library";
		
	
//charat()
		System.out.println(a.charAt(2));
		
//indexof
		
		System.out.println(a.indexOf("y"));    //always use quotations "" with a String.
		
		
//substring
		
		System.out.println(a.substring(0, 4));
	
//concat();
	
		
		System.out.println(a.concat(" of Carrollton"));
	
		
//length();
	//	System.out.println(a.length);
		
	
// split();
	String arr [] = (a.split("r"));
	System.out.println(arr[0]);
	System.out.println(arr[1]);

	}

}
