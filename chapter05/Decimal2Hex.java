package chapter05;

import java.util.Scanner;

public class Decimal2Hex {

	/** Main Method */
	public static void main(String[] args) {
		// Create Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Prompt the user enter an decimal
		System.out.print("Enter a decimal number : ");
		int decimal = input.nextInt();

		// Convert decimal to hex
		String hex = "";

		while (decimal != 0) {
			int hexValue = decimal % 16;

			char hexDigit = (hexValue >= 0 && hexValue <= 9) ? (char) (hexValue + '0') : (char) (hexValue - 10 + 'A');
			
			hex = hexDigit + hex;
			
			decimal = decimal / 16;
		}
		
		// Display the result
		System.out.println("The hex number is " + hex);
	}
}
