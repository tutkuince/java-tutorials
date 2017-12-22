package chapter05.exercises;

public class DisplayPatternA {

	/*
	 * 1
	 * 1 2
	 * 1 2 3
	 * 1 2 3 4
	 * 1 2 3 4 5
	 * 1 2 3 4 5 6
	 * 
	 */
	
	/** Main Method */
	public static void main(String[] args) {
		
		// Display pattern a
		System.out.println("Pattern A\n");
		
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
