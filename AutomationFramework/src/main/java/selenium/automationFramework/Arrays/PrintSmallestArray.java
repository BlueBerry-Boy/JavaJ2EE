package selenium.automationFramework.Arrays;

public class PrintSmallestArray {

	public static void main(String[] args) {
		/**
		 * 985
		 * 499 
		 * 763
		 */

		// Print the smallest number from the above matrix

		// Step 1; initialize the array
		int xyz[][] = { { 9, 8, 5 }, { 4, 9, 9 }, { 7, 6, 3 } };
		int smallest = xyz[0][0];

		// Step 2; create a nested loop (Outer & inner) loop to go through each number
		// Step 3; Declare a variable which defines the smallest number in the array(int smallest)

		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {
				if (xyz[a][b] < smallest) {
					smallest = xyz[a][b];
				}
			}

		}
		System.out.println("The smallest number is: " + smallest);

	}

}
