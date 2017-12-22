package chapter07;

import java.util.Scanner;

public class LinearSearch {

	/** Main method */
	public static void main(String[] args) {
		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Create 3 random number
		int[] randomNumbers = createRandomNumber();

		// Prompt the user to make a guess
		System.out.print("Make a guess 1 to 10 : ");
		int guess = input.nextInt();

		// Linear search
		if(lineerSearch(randomNumbers, guess)){
			System.out.println("You found my guess");
		}else{
			System.out.println("You didn't find my guess");
		}
	}

	/** Create 3 random number 1 to 10 */
	private static int[] createRandomNumber() {
		int[] rndNumbers = new int[3];
		for (int i = 0; i < rndNumbers.length; i++) {
			rndNumbers[i] = (int) (Math.random() * 10);
		}
		return rndNumbers;
	}

	/** Linear search */
	public static boolean lineerSearch(int[] rndNumbers, int guess) {
		for (int i = 0; i < rndNumbers.length; i++) {
			if (guess == rndNumbers[i]) {
				return true;
			}
		}
		return false;
	}
}
