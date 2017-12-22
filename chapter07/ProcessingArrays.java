package chapter07;

public class ProcessingArrays {

	/** Main method */
	public static void main(String[] args) {

		// Create numbers array
		int[] numbers = new int[25];

		// Initializing array with random number
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100);
		}

		// Display number array's value
		for (int i = 0; i < numbers.length; i++) {
			if (i % 5 == 0) {
				System.out.println();
			}
			System.out.printf("%3d", numbers[i]);
		}

		// Sum all elements in numbers array
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		// Display sum
		System.out.println("\nSum is " + sum);

		// Find largest element in numbers array
		int largestElement = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (largestElement < numbers[i]) {
				largestElement = numbers[i];
			}
		}
		// Display the largest element
		System.out.println("Largest element is " + largestElement);

		// Finding the smallest index of the largest element
		int max = 0;
		int maxIndex = -1;
		for (int i = 0; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
				maxIndex = i;
			}
		}
		// Display the largest element
		System.out.println("Largest element is " + max);
		System.out.println("Largest element's index is " + maxIndex);

		// Random shuffling
		for (int i = 0; i < numbers.length; i++) {
			int rndIndex = (int) (Math.random() * numbers.length);

			int temp = numbers[i];
			numbers[i] = numbers[rndIndex];
			numbers[rndIndex] = temp;
		}
		// Display shuffling value
		for (int i = 0; i < numbers.length; i++) {
			if (i % 5 == 0) {
				System.out.println();
			}
			System.out.printf("%3d", numbers[i]);
		}
		System.out.println();
		System.out.print("\nShifting element (right)");
		// Shifting element (right)
		for (int i = 0; i < numbers.length; i++) {
			int temp = numbers[i];
			numbers[i] = numbers[numbers.length - 1];
			numbers[numbers.length - 1] = temp;
		}
		// Display shifting elements
		for (int i = 0; i < numbers.length; i++) {
			if (i % 5 == 0) {
				System.out.println();
			}
			System.out.printf("%3d", numbers[i]);
		}
		System.out.println();
		System.out.print("\nShifting element (left)");
		// Shifting element (left)
		for (int i = 1; i < numbers.length; i++) {
			int temp = numbers[i];
			numbers[i - 1] = numbers[i];
			numbers[i] = temp;
		}
		// Display shifting elements
		for (int i = 0; i < numbers.length; i++) {
			if (i % 5 == 0) {
				System.out.println();
			}
			System.out.printf("%3d", numbers[i]);
		}
	}
}
