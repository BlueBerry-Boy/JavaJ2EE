package selenium.automationFramework.reverseString;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



	public class Reverse_the_sentence {
		
//		public static void main (String [] args) {	
//			String Reverse = "I am a coder";
//			String arr[] = Reverse.split(" ");	
//			for(int x = arr.length-1; x>=0; x--)
//			{
//				System.out.print(arr[x] + " ");
//			}
//
// }
		
		
		@Test
		public static void reverseTheWholeSentence(String reverse) {
			
			String Arr [] = reverse.split(" ");
			
			for(int i= Arr.length-1; i>=0; i--) {
				System.out.print(Arr[i] + " ");
			}
			
	}
	
		
		@Test
		public void reverse() {	
		Reverse_the_sentence.reverseTheWholeSentence("JP Morgan Chase");
			
		}
}
