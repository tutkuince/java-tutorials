package chapter02.exercises;

import java.util.Scanner;


public class NumberOfYears {

	/*
	 * (Find the number of years) Write a program that prompts the user to enter
	 * the minutes (e.g., 1 billion), and displays the number of years and days
	 * for the minutes.
	 * 
	 * For simplicity, assume a year has 365 days.
	 */
	public static void main(String[] args) {

		// Create Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Prompt user for input
		System.out.print("Enter the number of minutes : ");
		int minutes = input.nextInt();

		// Compute total year in minutes
		int years = minutes / (60 * 24 * 365);

		// Compute remaining year
		int remainingYear = minutes % (60 * 24 * 365);
		
		//Compute days
		int days = remainingYear / (60 * 24);
		
		System.out.println(minutes + " minutes " + years + " years and " + days + " days");
		

	}
}
