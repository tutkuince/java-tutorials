package chapter04.exercises;

import java.util.Scanner;

public class FindUnicodeChar {

	/*
	 * (Find the Unicode of a character) Write a program that receives a
	 * character and displays its Unicode.
	 */
	public static void main(String[] args) {
		// Create Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a character
		System.out.print("Enter a char : ");
		char ch = input.next().charAt(0);
		
		// Display the result
		System.out.println("The Unicode for the character " + ch + " is " + (int)ch);
	}
}
