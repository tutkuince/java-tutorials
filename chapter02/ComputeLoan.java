package chapter02;

import java.util.Scanner;

public class ComputeLoan {

	/*
	 * The program must satisfy the following requirements:
	 * 
	 * It must let the user enter the interest rate, the loan amount, and the
	 * number of years for which payments will be made. It must compute and
	 * display the monthly payment and total payment amounts.
	 */
	public static void main(String[] args) {

		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Enter annual interest rate in percentage, e.g., 7.25%
		System.out.print("Enter annual interest rate in percentage, e.g., 7.25% : ");
		double annualInterestRate = input.nextDouble();
		
		// Obtain monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;

		// Enter number of years
		System.out.print("\nEnter number of years  : ");
		int year = input.nextInt();

		// Enter loan amount
		System.out.print("\nEnter loan amount, e.g., 120000 : ");
		double loanAmount = input.nextDouble();

		// Compute monthly payment
		double monthlyPayment = ((loanAmount * monthlyInterestRate)
				/ (1 - (1 / (Math.pow((1 + monthlyInterestRate), year * 12)))));

		// Compute total payment
		double totalPayment = monthlyPayment * year * 12;

		// Display the result
		System.out.println("Total payment : $" + (int) (totalPayment * 100) / 100.0);
		System.out.println("Monthly payment : $" + (int) (monthlyPayment * 100) / 100.0);
	}
}
