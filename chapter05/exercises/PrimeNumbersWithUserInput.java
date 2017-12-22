package chapter05.exercises;

import java.util.Scanner;

public class PrimeNumbersWithUserInput {

	/** Main Method */
	public static void main(String[] args) {
		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Prompt to user to enter an integer for find 2 to number of primes 
		System.out.print("Enter an integer : ");
		int number = input.nextInt();
		
		// Counter
		int counter = 0;
		
		// Display 5 primes per line
		final int NUMBER_OF_PRIMES_PER_LINE = 5;
		
		// Find prime numbers and display the result
		boolean isPrime = true;
		for (int i = 2; i < number; i++) {
			for (int j = 2; j <= i / 2; j++) {
				if(i % j == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				if(counter % NUMBER_OF_PRIMES_PER_LINE == 0){
					System.out.println();
				}
				System.out.printf("%3d", i);
				counter++;
			}
			isPrime = true;
		}
	}
}
