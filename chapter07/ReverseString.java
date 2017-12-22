package chapter07;

import java.util.Scanner;

public class ReverseString {

	/** Main method*/
	public static void main(String[] args) {
		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a string
		System.out.print("Enter something for reverse : ");
		String str = input.nextLine();
		
		// Convert str to char[]
		char[] charStr = str.toCharArray();
		
		// Invoke reverse method 
		char[] reverseStr = reverse(charStr);
		
		
		// Display result
		for (int i = 0; i < reverseStr.length; i++) {
			System.out.print(reverseStr[i]);
		}
	}

	/** Return reverse char[] */
	private static char[] reverse(char[] charStr) {
		char[] reverseStr = new char[charStr.length];
		for (int i = 0; i < charStr.length; i++) {
			reverseStr[i] = charStr[charStr.length - 1 - i];
		}
		
		return reverseStr;
	}
}
