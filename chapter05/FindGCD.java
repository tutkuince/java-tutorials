package chapter05;

import java.util.Scanner;

public class FindGCD {

	// Find greatest common divisor

	/** Main Method */
	public static void main(String[] args) {
		// Create Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter first number
		System.out.print("Enter first integer : ");
		int number1 = input.nextInt();

		// Prompt the user to enter second number
		System.out.print("Enter second integer : ");
		int number2 = input.nextInt();

		// Initial GCD
		int gcd = 1;

		// Possible gcd
		int k = 2;

		// Find gcd
		while(number1 >= k && number2 >= k){
			if (number1 % k == 0 && number2 % k == 0) {
				gcd = k;
			}
			k++;
		}
		
		// Display the result
		System.out.println("The greatest common diviser for " + number1 + " and " + number2 + " is " + gcd);
	}
}
