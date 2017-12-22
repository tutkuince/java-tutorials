package chapter02.exercises;

import java.util.Scanner;

public class CalculateFutureInvestment {

	/*
	 * (Financial application: calculate future investment value) Write a
	 * program that reads in investment amount, annual interest rate, and number
	 * of years, and displays the future investment value using the following formula:
	 * 
	 * futureInvestmentValue = investmentAmount * ((1 + monthlyInterestRate))numberOfYears*12
	 */
	public static void main(String[] args) {
		//Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//Propmt user for input
		System.out.print("Enter investment amount : ");
		double investmentAmount = input.nextDouble();
		
		System.out.print("Enter annual interest rate in persentage : ");
		double annualInterestRate = input.nextDouble();
		
		System.out.print("Enter number of years : ");
		double numberOfYears = input.nextDouble();
		
		//Calculate monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;
		
		//Calculate future investment value
		double futureInvestmentValue = investmentAmount * (Math.pow((1 + monthlyInterestRate), numberOfYears * 12));
		
		//Display the result
		System.out.println("Accumlated value is : $" + (int)(futureInvestmentValue * 100) / 100.0);
	}
}
