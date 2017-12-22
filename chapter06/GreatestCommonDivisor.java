package chapter06;

import java.util.Scanner;

public class GreatestCommonDivisor {

	/** Main method */
	public static void main(String[] args) {
		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter 2 integers
		System.out.print("Enter a number : ");
		int number1 = input.nextInt();

		System.out.print("Enter a number : ");
		int number2 = input.nextInt();

		// Display the result
		System.out.println(
				"The greatest common divisor for " + number1 + " and " + number2 + " is " + gcd(number1, number2));
	}

	/** Return the gcd of 2 integers */
	public static int gcd(int num1, int num2) {

		// Initial gcd is 1
		int gcd = 1;

		// Possible gcd
		int possibleGCD = 2;

		// Compute gcd
		while (num1 >= possibleGCD && num2 >= possibleGCD) {
			if (num1 % possibleGCD == 0 && num2 % possibleGCD == 0) {
				gcd = possibleGCD;
			}
			possibleGCD++;
		}
		// Return result
		return gcd;
	}
}
