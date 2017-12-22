package chapter07;

import java.util.Arrays;

public class ArrayClass {

	/** Main method */
	public static void main(String[] args) {
		int[] list = { 1, 2, 5, 3, 8, 4, 9, 0, 11 };
		int[] list2 = { 1, 2, 5, 3, 8, 4, 9, 0, 10 };

		// Sort the whole array
		Arrays.sort(list);
		Arrays.sort(list2);

		// Display the result
		printArrays(list);
		printArrays(list2);

		// Binary search ( return index)
		System.out.println(Arrays.binarySearch(list, 6));
		System.out.println(Arrays.binarySearch(list2, 10));
		
		// Equals
		System.out.println(Arrays.equals(list, list2));
		
		// toString
		System.out.println(Arrays.toString(list));
		System.out.println(Arrays.toString(list2));
		
		

	}

	/** Print arrays */
	public static void printArrays(int[] list) {
		for (int i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
