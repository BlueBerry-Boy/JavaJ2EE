package selenium.automationFramework.controlStatements;

import org.testng.annotations.Test;

public class ForeachLoop {
		
		/**Syntax:
		 *        for( type iterationVariable : collection){
		 *        Code Block;
		 *        } 
		 */
		
	@Test	
	public void forEachLoopsum() {
		
		int nums [] = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		for(int i : nums) {
			System.out.println("The numbers are " +i);
			sum += i;	
		}
		
		System.out.println("The sum of the collection is " +sum);
	}
	
	
}
