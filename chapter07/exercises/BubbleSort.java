package chapter07.exercises;

import java.util.Arrays;

public class BubbleSort {
	/** Main method */
	public static void main(String[] args) {
		int[] numbers = { 5, 7, 2, 9, 6, 1, 3 };

		// Invoke bubble sort method
		bubbleSort(numbers);
		
		// Display the result
		System.out.println(Arrays.toString(numbers));
	}

	/** Bubble sort */
	private static void bubbleSort(int[] numbers) {

		for (int i = 1; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - i; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
	}
}
