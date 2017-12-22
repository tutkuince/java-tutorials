package chapter05;

import java.util.Scanner;

public class Palindrome {

	/** Main Method */
	public static void main(String[] args) {
		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a string
		System.out.print("Enter a string : ");
		String str = input.nextLine();

		// Check Palindrom
		boolean isPalindrome = true;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				isPalindrome = false;
				break;
			}
		}
		// Display the result
		if (isPalindrome) {
			System.out.println(str + " is a palindrom");
		} else {
			System.out.println(str + " is not a palindrom.");
		}

	}
}
