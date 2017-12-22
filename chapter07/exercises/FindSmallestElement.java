package chapter07.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class FindSmallestElement {

	/*
	 * Write a test program that prompts the user to enter ten numbers, invokes
	 * this method to return the minimum value, and displays the minimum value.
	 */

	/** Main method */
	public static void main(String[] args) {
		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		double[] numbers = new double[10];

		// Prompts the user to enter ten numbers
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter ten numbers : ");
			double number = input.nextDouble();
			numbers[i] = number;
		}

		// Invoke min method
		double min = min(numbers);
		
		// Print the result 
		System.out.println("The minimum number is : " + min);
	}

	/** Find minimum element in array */
	public static double min(double[] array) {
		
		// Sort array
		Arrays.sort(array);
		
		// Return the smallest
		return array[0];
	}
}
