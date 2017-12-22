package chapter07;

import java.util.Scanner;

public class AnalyzeNumbers {

	/*
	 * get the average of these numbers, and find the number of the items
	 * greater than the average.
	 */

	/** Main method */
	public static void main(String[] args) {
		//Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter number of items
		System.out.print("Enter number of items : ");
		int numberOfItems = input.nextInt();
		
		double[] numbers = new double[numberOfItems];
		
		// sum
		double sum = 0;
		
		// Prompt the user to enter numbers
		
		for (int i = 0; i < numberOfItems; i++) {
			System.out.print("Enter number : ");
			numbers[i] = input.nextDouble();
			sum += numbers[i];
		}
		
		// Compute average
		double average = sum / numberOfItems;
		
		// Find the number of the items greater than the average.
		int counter = 0; // number of the items greater than the average count
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] > average){
				counter++;
			}
		}
		
		// Display the result
		System.out.println("Average is " + (int)(average * 100) / 100.0);
		System.out.println("There are/is " + counter + " number of the items greater than " + average);
	}
}
