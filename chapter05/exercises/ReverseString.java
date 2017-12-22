package chapter05.exercises;

import java.util.Scanner;

public class ReverseString {

	/*
	 * (Reverse a string) Write a program that prompts the user to enter a
	 * string and displays the string in reverse order.
	 */

	/** Main Method */
	public static void main(String[] args) {
		// Create Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a string
		System.out.print("Enter a string : ");
		String text = input.nextLine();

		// Output
		String output = "";

		// Reverse string
		for (int i = 0; i < text.length(); i++) {
			output += text.charAt(text.length() - 1 - i);
		}

		// Display the result
		System.out.println(output);
	}
}
