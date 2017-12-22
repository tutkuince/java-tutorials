package chapter02;

import java.util.Scanner;

public class ComputeChange {

	/*
	 * a program that breaks a large amount of money into smaller units.
	 */
	public static void main(String[] args) {

		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Prompt the user input
		System.out.print("Enter an amount in double, for example 11.56 : ");
		double amount = input.nextDouble();

		int remainingAmount = (int) (amount * 100);

		// Find the number of one dolars
		int numberOfDolars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;

		// Find the number of 25 cents
		int numberOfQuarter = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		//Find the number of 10 cents
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		//Find the number of 5 cents
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		//Number of pennies
		int numberOfPennies = remainingAmount;
		
		//Display result
		System.out.println("Your amount " + amount + " consists of ");
		System.out.println(numberOfDolars + " dolars");
		System.out.println(numberOfQuarter + " quarters");
		System.out.println(numberOfDimes + " dimes");
		System.out.println(numberOfNickels + " nickels");
		System.out.println(numberOfPennies + " pennies");
	}
}
