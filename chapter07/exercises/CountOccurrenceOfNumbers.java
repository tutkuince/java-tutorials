package chapter07.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class CountOccurrenceOfNumbers {

	/*
	 * Write a program that reads the integers between 1 and 100 and counts the
	 * occurrences of each. Assume the input ends with 0.
	 */

	/** Main method */
	public static void main(String[] args) {
		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int counter = 0;

		int[] numbers = new int[counter];

		while (true) {
			System.out.print("Enter the integer between 1 and 100 : ");
			int number = input.nextInt();

			// If number is 0, break
			if (number == 0) {
				break;
			}

			// Increase counter
			counter++;

			// Resize the numbers array
			numbers = Arrays.copyOf(numbers, counter);

			// Generate value to array
			numbers[counter - 1] = number;
		}
		sort(numbers);
		
		// Find count of numbers
		int[] counts = countOfNumbers(numbers);
		
		// Print results
		printOccurenceOfNumbers(numbers, counts);
	}

	/** Print the result*/
	private static void printOccurenceOfNumbers(int[] numbers, int[] counts) {
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] != 0){
				System.out.println(numbers[i] + " occurs " + counts[i] + " time(s).");
			}
		}
	}

	/** Sort numbers[] */
	public static void sort(int[] numbers){
		Arrays.sort(numbers);
	}
	
	/** Find count of numbers */
	public static int[] countOfNumbers(int[] numbers){
		int[] counts = new int[numbers.length];
		
		for (int i = 0; i < numbers.length; i++) {
			counts[i] = 1;
		}
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if(numbers[i] == numbers[j] && numbers[i] != 0){
					counts[i]++;
					numbers[j] = 0; // if numbers array has same number, it generates value to 0
				}
			}
		}
		return counts;
	}
}
