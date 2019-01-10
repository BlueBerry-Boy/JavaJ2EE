package selenium.automationFramework.Loops;

public class PyramidStairs {

	public static void main(String[] args) {
		/** Write code to produce the following output
		 * 
			3
			6 9
			12 15 18
		*/
		
		
		int k =1;
				
		for (int i=0; i<4; i++)
		{
			for(int z=0; z<i; z++)
				{
					
					System.out.print(k*3);
					//System.out.println("\t");	
					k++;
				}
			
			System.out.println("");
					
		}

	}

}
