package chapter04;

import java.util.Scanner;

public class LotteryUsingString {

	/*
	 * Listing 4.5 gives a new program that generates a random two-digit string
	 * instead of a number and receives the user input as a string instead of a
	 * number.
	 */
	public static void main(String[] args) {
		// Create Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Generate a random two-digit string
		String lottery = "" + (int) (Math.random() * 10) + (int) (Math.random() * 10);

		// Prompt the user to enter user's guess as String
		System.out.print("Enter your guess (2 Digits): ");
		String guess = input.next();

		// Get digits from lottery
		char lotteryDigit0 = lottery.charAt(0);
		char lotteryDigit1 = lottery.charAt(1);

		// Get digits from user's guess
		char guessDigit0 = guess.charAt(0);
		char guessDigit1 = guess.charAt(1);

		// Check the guess and display the result
		if (guess.equals(lottery)) {
			System.out.println("Exact match! You win $10,000");
		} else if (lotteryDigit0 == guessDigit1 && lotteryDigit1 == guessDigit0) {
			System.out.println("Match all digits! You win $3,000");
		} else if ((lotteryDigit0 == guessDigit0 || lotteryDigit0 == guessDigit1)
				|| (lotteryDigit1 == guessDigit0 || lotteryDigit1 == guessDigit1)) {
			System.out.println("Match one digit! You win $1,000");
		} else {
			System.out.println("Sorry, no match!!!");
		}
	}
}
