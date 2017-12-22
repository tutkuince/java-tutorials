package chapter05.exercises;

public class DisplayPatternE {

	/*
	 * 1
	 * 2 1
	 * 3 2 1
	 * 4 3 2 1
	 * 5 4 3 2 1
	 * 6 5 4 3 2 1
	 * 
	 */
	
	/** Main Method */
	public static void main(String[] args) {
		
		// Display pattern E
		System.out.println("Pattern E\n");
		
		for (int i = 1; i < 7; i++) {
			for (int j = i; j > 0; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
