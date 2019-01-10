package selenium.automationFramework.Arrays;

public class PrintLargestArray {

	public static void main(String[] args) {
		/**
		 * 1 16 7 8
		 * 9 3 4 5
		 * 7 8 15 4
		 * 0 8 10 53
		 * 6 0 3 47
		 */
		
		
		int abc[][]= {{1,16,7,8},{9,3,4,5},{7,8,15,4},{0,8,10,53},{6,0,3,47}};
		int largest= abc[0][0];
		
			for(int i=0; i<5;i++)
			{
				for(int j=0;j<4;j++)
				{
					if(abc[i][j]>largest)
					{
						largest = abc[i][j];
					}
				}	
				
				
			}
		
				System.out.println("The largest no. is" + " " + largest);


	}

}
