package chapter07.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDistinctNumbers {

	/*
	 * Write a program that reads in ten numbers and displays the number of
	 * distinct numbers and the distinct numbers separated by exactly one space
	 * (i.e., if a number appears multiple times, it is displayed only once).
	 * (Hint: Read a number and store it to an array if it is new. If the number
	 * is already in the array, ignore it.) After the input, the array contains
	 * the distinct numbers.
	 */

	/** Main method */
	public static void main(String[] args) {
		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int counter = 0;

		int index = 0;

		// Prompt the user to enter 10 numbers
		System.out.print("Enter ten numbers : ");

		String[] numbers = new String[counter];

		while (counter < 10) {
			String number = input.next();

			if (isDistinct(numbers, number)) { // Invoke isDistinct method
				index++;
				numbers = Arrays.copyOf(numbers, index);
				numbers[index - 1] = number;
			}
			counter++;
		}
		
		// print the result
		printDistinctNumbers(numbers);
	}

	/** Print distinct numbers */
	private static void printDistinctNumbers(String[] numbers) {
		// Sort numbers array
		Arrays.sort(numbers);
		
		// the number of distinct numbers
		System.out.println("The number of distinct numbers is " + numbers.length);
		
		// print the distinct numbers
		System.out.print("The distinct numbers are : ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
	}

	/** Check if the number is distinct or not */
	public static boolean isDistinct(String[] numbers, String number) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i].equals(number)) {
				return false;
			}
		}
		return true;
	}
}
