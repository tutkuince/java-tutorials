package chapter02.exercises;

import java.util.Scanner;

public class ComputeFinancialApp {

	/*
	 * (Financial application: compound value) Suppose you save $100 each month
	 * into a savings account with the annual interest rate 5%. Thus, the
	 * monthly interest rate is 0.05/12 = 0.00417. After the first month, the
	 * 
	 * value in the account becomes 100 * (1 + 0.00417) = 100.417
	 * 
	 * After the second month, the value in the account becomes (100 + 100.417)
	 * * (1 + 0.00417) = 201.252
	 * 
	 * After the third month, the value in the account becomes (100 + 201.252) *
	 * (1 + 0.00417) = 302.507
	 * 
	 * Write a program that prompts the user to enter a monthly saving amount
	 * and displays the account value after the sixth month. (In Exercise 5.30,
	 * you will use a loop to simplify the code and display the account value
	 * for any month.)
	 */

	public static void main(String[] args) {

		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Propmt the user for input
		System.out.print("Enter the monthly saving amount : ");
		double amount = input.nextDouble();

		// Calculate monthly interest rate
		double monthlyInterestRate = 0.05 / 12;

		// After the first month, the value in the account becomes
		double totalAmount = amount * (1 + monthlyInterestRate);

		// After the second month, the value in the account becomes
		totalAmount = (amount + totalAmount) * (1 + monthlyInterestRate);

		// After the third month, the value in the account becomes
		totalAmount = (amount + totalAmount) * (1 + monthlyInterestRate);

		// After the forth month, the value in the account becomes
		totalAmount = (amount + totalAmount) * (1 + monthlyInterestRate);

		// After the fifth month, the value in the account becomes
		totalAmount = (amount + totalAmount) * (1 + monthlyInterestRate);

		// After the sixth month, the value in the account becomes
		totalAmount = (amount + totalAmount) * (1 + monthlyInterestRate);
		
		//Display the result
		System.out.println("After the six month, the account value is $" + (int)(totalAmount *100) / 100.0);
	}
}
