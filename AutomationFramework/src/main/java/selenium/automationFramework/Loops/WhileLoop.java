package selenium.automationFramework.Loops;

public class WhileLoop {

	public static void main(String[] args) {

		// increment

		int x[] = { 1, 2, 3, 4, 5 };

		int s = 0;

		while (s < 5) {
			System.out.println(x[s]);

			s++;
		}

		
		// Decrement
		int z[] = { 1, 2, 3, 4, 5 };

		int m = 4;

		while (m > 0) {
			System.out.println(z[m]);

			m--;
		}
	}

}
