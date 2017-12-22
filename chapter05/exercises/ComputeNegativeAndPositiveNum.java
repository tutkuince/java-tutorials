package chapter05.exercises;

import java.util.Scanner;

public class ComputeNegativeAndPositiveNum {

	/*
	 * Write a program that reads an unspecified number of integers, determines
	 * how many positive and negative values have been read, and computes the
	 * total and average of the input values (not counting zeros). Your program
	 * ends with the input 0. Display the average as a floating-point number.
	 */
	/** Main Method */
	public static void main(String[] args) {

		// Create Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Positive numbers
		int positiveNumbers = 0;
		
		// Negative Numbers
		int negativeNumbers = 0;
		
		// Counter
		int counter = 0;
		
		// Numbers
		int total = 0;
		
		
		while (true) {
			System.out.print("Enter an integer, the input ends if it is 0: "); // prompt user for enter an integer
			double number = input.nextDouble();
			
			// Check if integer is 0 or not
			if(number == 0 && total == 0){
				System.out.println("No numbers are entered except 0");
				return;
			}else if (number == 0) {
				break;
			}

			// Check number is positive or negative
			if (number > 0) {
				positiveNumbers++;
			} else {
				negativeNumbers++;
			}

			// compute sum
			total += number;

			// increase counter
			counter++;
		}

		// Compute average
		double average = (double) total / counter;

		// Display the result
		System.out.println("The number of positives is " + positiveNumbers);
		System.out.println("The number of negatives is " + negativeNumbers);
		System.out.println("The total is : " + total);
		System.out.println("The average is " + average);
	}
}
