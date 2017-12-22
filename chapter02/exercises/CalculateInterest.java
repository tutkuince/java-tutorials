package chapter02.exercises;

import java.util.Scanner;

public class CalculateInterest {

	/*
	 * (Financial application: calculate interest) If you know the balance and
	 * the annual percentage interest rate, you can compute the interest on the
	 * next monthly payment using the following formula: 
	 * 
	 * interest = balance * (annualInterestRate/1200)
	 * 
	 * Write a program that reads the balance and the
	 * annual percentage interest rate and displays the interest for the next
	 * month.
	 */
	public static void main(String[] args) {
		//Create Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//Prompt user for input
		System.out.print("Enter balance : ");
		double balance = input.nextDouble();
		
		System.out.print("Enter interest rate : ");
		double annualInterestRate = input.nextDouble();
		
		//Compute interest
		double interest = balance * (annualInterestRate / 1200);
		
		//Display the result
		System.out.println("The interest is " + (int)(interest * 100000) / 100000.0);
		
	}
}
