package chapter05;

import java.util.Scanner;

public class FindSmallestFactor {

	// Find smallest factor other than 1

	/** Main Method */
	public static void main(String[] args) {
		// Create Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a number for find smallest factor
		System.out.print("Enter a number for find smallest factor : ");
		int number = input.nextInt();
		
		// Find smallest factor 
		int factor = 2;
		
		while(factor < number){
			if(number % factor == 0){
				break;
			}
			factor++;
		}
		
		// Display the result
		System.out.println("The smallest factor is " + factor);
	}
}
