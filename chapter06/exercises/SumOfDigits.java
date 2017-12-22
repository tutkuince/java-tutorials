package chapter06.exercises;

import java.util.Scanner;

public class SumOfDigits {

	/*
	 * (Sum the digits in an integer) Write a method that computes the sum of
	 * the digits in an integer
	 */

	/** Main method */
	public static void main(String[] args) {
		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter an long value
		System.out.print("Enter an integer for displaying sum of digits : ");
		int number = input.nextInt();
		
		// Invoke sumDigits method and display result
		System.out.println("Sum digits : " + sumDigits(number));
	}

	/** Compute sum of digits */
	public static int sumDigits(long n) {
		int total = 0;
		
		// Divide all digits of number
		while(n > 0){
			total += n % 10;
			n = n / 10;
		}
		
		return total;
	}
}
