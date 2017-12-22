package chapter06.exercises;

import java.util.Scanner;

public class PalindromeInteger {

	/** Main method */
	public static void main(String[] args) {
		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a number
		System.out.print("Enter a number : ");
		int number = input.nextInt();

		// Display the result
		if (isPalindrome(number)) {
			System.out.println(number + " is palindrome");
		} else {
			System.out.println(number + " is not palindrome");
		}
	}

	/** Return the reversal of an integer, i.e., reverse(456) returns 654 */
	public static int reverse(int number) {
		String reverseNumber = "";
		String num = String.valueOf(number); // Convert number to string 

		for (int i = 0; i < num.length(); i++) {
			reverseNumber = num.charAt(i) + reverseNumber;
		}

		return Integer.parseInt(reverseNumber);
	}

	/** Return true if number is a palindrome */
	public static boolean isPalindrome(int number) {

		// Reteturn the revers of number
		int palindromeNumber = reverse(number);

		return number == palindromeNumber;
	}
}
