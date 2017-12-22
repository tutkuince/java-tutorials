package chapter05.exercises;

public class DisplayPatternC {

	/*
	 * 			      1
	 * 		        2 1
	 * 		      3 2 1
	 * 		    4 3 2 1
	 * 		  5 4 3 2 1
	 * 		6 5 4 3 2 1
	 * 
	 * */
	
	/** Main Method */
	public static void main(String[] args) {
		// Display Pattern C
		System.out.println("Pattern C\n");
		
		for (int i = 1; i < 7; i++) {
			for (int j = i; j > 0 ; j--) {
				for (int k = j; k < 7; k++) {
					if(k > i && j == i){
						System.out.print("  ");
					}
				}
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
