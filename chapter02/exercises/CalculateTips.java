package chapter02.exercises;

import java.util.Scanner;

public class CalculateTips {

	/*
	 * (Financial application: calculate tips) Write a program that reads the
	 * subtotal and the gratuity rate, then computes the gratuity and total. 
	 * For example, if the user enters 10 for subtotal and 15% for gratuity rate,
	 * the program displays $1.5 as gratuity and $11.5 as total.
	 */
	public static void main(String[] args) {
		
		//Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//Prompt user for input
		System.out.print("Enter the subtotal : ");
		double subtotal = input.nextDouble();
		System.out.print("Enter the gratuity : ");
		double gratuity = input.nextDouble();
		
		//Compute gratuity rate
		double gratuityRate = gratuity * 10 / 100.0;
		
		//Compute total
		double total = subtotal + gratuityRate;
		
		//Display results
		System.out.println("The gratuity is $" + gratuityRate + " and total is $" + total);
	}
}
