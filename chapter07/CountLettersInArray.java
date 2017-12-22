package chapter07;

public class CountLettersInArray {

	/** Main method */
	public static void main(String[] args) {
		// Declare and create array
		char[] chars = createArray();

		// Display array
		System.out.println("The lower case are : ");
		displayArray(chars);

		int[] counts = countLetter(chars);

		// Display the count
		System.out.println();
		System.out.println("The occurrences of each letter are : ");
		displayCounts(counts);
	}

	/** Create an array of characters */
	private static char[] createArray() {
		// Declare an array of characters and create it
		char[] chars = new char[100];

		// Create lower case randomly and assign them to the array
		createRandomCharacters(chars);

		// Return the array
		return chars;
	}

	/** Create lower case randomly and assign them to the array */
	private static void createRandomCharacters(char[] chars) {
		for (int i = 0; i < chars.length; i++) {
			chars[i] = (char) ((int) ((Math.random() * (26)) + 'a'));
		}
	}

	/** Display the array of characters */
	private static void displayArray(char[] chars) {
		// Display the characters in the array 20 on each line
		for (int i = 0; i < chars.length; i++) {
			if (i % 20 == 0) {
				System.out.println();
			}
			System.out.print(chars[i] + " ");
		}
	}

	/** Count the occurrences of each letter */
	private static int[] countLetter(char[] chars) {
		// Declare and create an array of 26 int
		int[] counts = new int[26];

		// For each lower case letter in the array, count it
		for (int i = 0; i < chars.length; i++) {
			counts[chars[i] - 'a']++;
		}
		return counts;
	}

	/** Display counts */
	private static void displayCounts(int[] counts) {
		for (int i = 0; i < counts.length; i++) {
			if (i % 5 == 0) {
				System.out.println();
			}
			System.out.print((char) (i + 'a') + " : " + counts[i] + " | ");
		}
	}

}
