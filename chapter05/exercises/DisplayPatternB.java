package chapter05.exercises;

public class DisplayPatternB {

	/*
	 * 1 2 3 4 5 6
	 * 1 2 3 4 5
	 * 1 2 3 4
	 * 1 2 3 
	 * 1 2
	 * 1
	 * 
	 */
	
	/** Main Method */
	public static void main(String[] args) {
		// Display pattern b
		System.out.println("Pattern B\n");
		
		for (int i = 6; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
