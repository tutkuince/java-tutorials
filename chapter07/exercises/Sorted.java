package chapter07.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Sorted {

	/*
	 * Write a test program that prompts the user to enter a list and displays
	 * whether the list is sorted or not. Here is a sample run. Note that the
	 * first number in the input indicates the number of the elements in the
	 * list. This number is not part of the list.
	 */

	/** Main method */
	public static void main(String[] args) {
		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter list
		System.out.print("Enter the list : ");
		int counter = input.nextInt();

		int[] numbers = new int[counter];

		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter the list : ");
			int number = input.nextInt();
			numbers[i] = number;
		}
		int[] list = new int[counter];
		sort(list);
		
		if(isSorted(list, numbers)){
			System.out.println("the list is sorted");
		}else{
			System.out.println("the list is not sorted");
		}
		
	}

	/** Sort the numbers array */
	public static void sort(int[] numbers) {
		Arrays.sort(numbers);
	}

	/** list is sorted or not */
	public static boolean isSorted(int[] list, int[] numbers) {
		if(!Arrays.equals(list, numbers)){
			return false;
		}
		return true;
	}
}
