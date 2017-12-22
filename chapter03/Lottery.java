package chapter03;

import java.util.Scanner;

public class Lottery {

	/*
	 * Suppose you want to develop a program to play lottery. The program
	 * randomly generates a lottery of a two-digit number, prompts the user to
	 * enter a two-digit number, and determines whether the user wins according
	 * to the following rules:
	 * 
	 * 1. If the user input matches the lottery number in the exact order, the
	 * award is $10,000. 2. If all digits in the user input match all digits in
	 * the lottery number, the award is $3,000. 3. If one digit in the user
	 * input matches a digit in the lottery number, the award is $1,000.
	 * 
	 */
	public static void main(String[] args) {
		//Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//Generate a lottery number 
		int lottery = (int)(Math.random() * 100);
		
		//Prompt the user to enter a guess
		System.out.print("Enter a guess : ");
		int guess = input.nextInt();
		
		//Get digits from lottery
		int lotteryDigit1 = guess % 10;
		int lotteryDigit2 = guess / 10;
		
		//Get digits from guess
		int guessDigit1 = lottery % 10;
		int guessDigit2 = lottery / 10;
		
		// Check the guess
		if (lottery == guess) {
			System.out.println("Your guess matched the lottery number in the exact order!!! Your award is $10,000");
		} else if (((guessDigit1 * 10) + guessDigit2) == lottery) {
			System.out.println("All digits matched in the lottery number!!! Your award is $3,000");
		} else if ((guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2)
				|| (guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit1)) {
			System.out.println("Your guess matched a digit in the lottery number!!! Your award is $1,000");
		} else {
			System.out.println("Your guess doesnt match with lottery number! Please try again!!!");
		}
		System.out.println(lottery);
	}
}
