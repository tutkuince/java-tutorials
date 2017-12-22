package chapter05.exercises;

import java.util.Scanner;

public class ComputeFactorsOfInt {
	/*
	 * (Find the factors of an integer) Write a program that reads an integer
	 * and displays all its smallest factors in increasing order.
	 */

	/** Main Method */
	public static void main(String[] args) {
		// Create Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Prompt to user to enter an integer
		System.out.print("Enter an integer : ");
		int number = input.nextInt();

		String result = "";

		// Smallest Factor
		int smallest = 2;

		// Compute smallest factors
		while (number >= smallest) {
			if (number % smallest == 0) {
				result += smallest + ",";
				number /= smallest;
				continue;
			}
			smallest++;
		}

		// Display the result
		System.out.println(result);
	}
}
