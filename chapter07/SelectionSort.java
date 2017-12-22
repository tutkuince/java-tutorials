package chapter07;

public class SelectionSort {

	/** Main method */
	public static void main(String[] args) {

		double[] list = { 5.3, 1.6, 1.1, 0.5, 7.2, 2, 3, 5, 11 };
		
		// Invoke selectionSort method
		selectionSort(list);
	}

	/** The method for sorting the numbers */
	public static void selectionSort(double[] list) {
		for (int i = 0; i < list.length; i++) {
			// Find the minimum
			double currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}

			// Swap if necessary
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
		
		// Display the result
		for (double d : list) {
			System.out.print(d + " > ");
		}
	}
}
