package chapter07.exercises;

import java.util.Scanner;

public class FindTheIndexOfSmallestElement {

	/*
	 * Write a test program that prompts the user to enter ten numbers, invokes
	 * this method to return the index of the smallest element, and displays the
	 * index.
	 */

	/** Main method */
	public static void main(String[] args) {
		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);


		double[] numbers = new double[10];
		
		// Prompt the user to enter ten number
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter ten numbers : ");
			numbers[i] = input.nextDouble();
		}
		
		// Display the result
		int index = indexOfSmallestElement(numbers);
		System.out.println("The index of smallest element : " + index + " and smallest element is " + numbers[index]);
	}

	/** Find the index of smallest element */
	public static int indexOfSmallestElement(double[] array) {
		int minIndex = 0;
		for (int i = 0; i < array.length; i++) {
			// Find the minimum value
			double minValue = array[i];
			for (int j = i + 1; j < array.length; j++) {
				if(minValue > array[j]){
					minValue = array[j];
					minIndex = j;
				}
			}
		}
		return minIndex;
	}
}
