package chapter07;

public class SortAndBinarySearch {

	/** Main method */
	public static void main(String[] args) {
		int[] list = {6, 5, 2, 1, 5, 2, 9, 11, 1, 4, 5};
		
		// Invoke selectionSort method
		selectionSort(list);
		
		// Invoke binary search method
		int result = binarySearch(list, 3);
		
		if(result != -1){
			System.out.println("Your key is founded");
			return;
		}
		
		System.out.println("Key not found");
		
	}

	/** The method for sorting numbers */
	public static void selectionSort(int[] list) {
		for (int i = 0; i < list.length; i++) {
			// Find the minimum value and index
			int currentMin = list[i];
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
	}

	/** The method for binary search */
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;

		while (high >= low) {
			int mid = (high + low) / 2;
			if (key > list[mid]) {
				low = mid + 1;
			} else if (key == list[mid]) {
				return list[mid];
			} else {
				high = mid - 1;
			}
		}

		return -1; // key not found
	}
}
