package chapter04.exercises;

import java.util.Scanner;

public class FindTheCharOfASCIICode {

	/*
	 * Write a program that receives an ASCII code (an integer between 0 and
	 * 127) and displays its character.
	 */
	public static void main(String[] args) {
		// Create Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter an integer between 0 and 127
		System.out.print("Enter an integer between 0 and 127 : ");
		int number = input.nextInt();

		// Check number if it is greater than 127 or smallar than 0
		if (number > 127 || number < 0) {
			System.err.println("Please Enter an integer between 0 and 127");
		}

		// Display the result
		System.out.println("The character for ASCII code " + number + " is " + (char)number);
	}
}
