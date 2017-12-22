package chapter04.exercises;

import java.util.Scanner;

public class ConvertDecimalToHex {

	/*
	 * Write a program that prompts the user to enter an integer between 0 and
	 * 15 and displays its corresponding hex number
	 */
	public static void main(String[] args) {
		// Create Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Promp the user to enter an integer between 0 an 15
		System.out.print("Enter an integer between 0 an 15 : ");
		int number = input.nextInt();

		// Check if it is greater than 15 or smaller than 0
		if (number > 15 || number < 0) {
			System.err.println(number + " is invalid input!!!");
			System.exit(1);
		}
		
		// Calling method toHexString()
		String str = Integer.toHexString(number);

		// Display the result
		System.out.println("The hex value is " + str.toUpperCase());
	}
}
