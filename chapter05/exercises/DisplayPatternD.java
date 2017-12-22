package chapter05.exercises;

public class DisplayPatternD {

	/*
	 * 1 2 3 4 5 6
	 *   1 2 3 4 5
	 * 	   1 2 3 4
	 *       1 2 3
	 *         1 2
	 *           1
	 * */
	
	/** Main Method */
	public static void main(String[] args) {
		// Display pattern D
		System.out.println("Pattern D\n");
		
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= 7 - i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
