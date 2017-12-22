package chapter05;

public class MultiplicationTable {

	/** Main Method */
	public static void main(String[] args) {
		// Display the table heading
		System.out.println("\t\t\t   Multiplication Table\n");

		// Display the number title
		for (int j = 1; j <= 9; j++)
			System.out.print("\t" + j);

		System.out.println("\n---------------------------------------------------------------------------");

		// Display table body
		for (int i = 1; i <= 9; i++) {
			System.out.print(i + " |");
			for (int j = 1; j <= 9; j++) {
				// Display the product and align properly
				System.out.printf("\t%1d", i * j);
			}
			System.out.println();
		}
	}
}
