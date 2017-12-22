package chapter07;

public class CopyingArrays {

	/** Main method */
	public static void main(String[] args) {

		// copying arrays
		arrayCopy();

		System.out.println("------------------");

		// copying arrays values
		copyArraysValues();
	}

	/** Copying arrays value (deep copy) */
	public static void copyArraysValues() {
		int[] list1 = { 1, 2, 3, 4 };
		int[] list2 = { 5, 6, 7, 8 };

		// Display first result
		System.out.println("list1[0] : " + list1[0]);
		System.out.println("list2[0] : " + list2[0]);

		// Array copy with list2 to list1 values
		for (int i = 0; i < list1.length; i++) {
			list1[i] = list2[i];
		}

		// Display result after copying
		System.out.println("list1[0] : " + list1[0]);
		System.out.println("list2[0] : " + list2[0]);
	}

	/** Copying arrays (reference copy) */
	private static void arrayCopy() {

		int[] list1 = { 1, 2, 3, 4 };
		int[] list2 = { 5, 6, 7, 8 };

		// Display first result
		System.out.println("list1[0] : " + list1[0]);
		System.out.println("list2[0] : " + list2[0]);

		// Array copy
		list1 = list2;

		// Display result after copying
		System.out.println("list1[0] : " + list1[0]);
		System.out.println("list2[0] : " + list2[0]);

	}
}
