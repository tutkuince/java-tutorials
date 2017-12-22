package chapter04.exercises;

import java.util.Scanner;

public class VowelOrConsonant {

	/*
	 * (Vowel or consonant?) Write a program that prompts the user to enter a
	 * letter and check whether the letter is a vowel or consonant
	 */
	public static void main(String[] args) {
		// Create Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a letter
		System.out.print("Enter a letter : ");
		char letter = input.next().toUpperCase().charAt(0);

		// Check letter is letter
		if (letter >= 'A' && letter <= 'Z') {
			// Check letter is vowel or consonant and display the result
			if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
				System.out.println(letter + " is vowel");
			} else {
				System.out.println(letter + " is consonant");
			}
		}else{
			System.out.println(letter + " is an invalid input.");
		}
	}
}
