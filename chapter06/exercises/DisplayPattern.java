package chapter06.exercises;

import java.util.Scanner;

public class DisplayPattern {

	/*
	 * Write a method to display a pattern as follows:
	 * 
	 * 				  1
	 *				2 1
	 *			  3 2 1
	 *				...
	 *	n n-1 ... 3 2 1
	 */
	
	/** Main method */
	public static void main(String[] args) {
		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter number
		System.out.print("Enter a number : ");
		int number = input.nextInt();
		
		// Print pattern
		displayPattern(number);
	}
	
	/** Print pattern until n */
	public static void displayPattern(int n){
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = i; j < n; j++) {
				System.out.print("   ");
			}
			
			for (int j = i; j > 0; j--) {
				
				System.out.printf("%3d", j);
			}
			System.out.println();
		}
	}
}
