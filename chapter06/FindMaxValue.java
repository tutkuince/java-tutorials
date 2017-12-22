package chapter06;

import java.util.Scanner;

public class FindMaxValue {

	/** Main method */
	public static void main(String[] args) {
		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter 2 numbers
		System.out.print("Enter two integer for finding max value : ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();

		// Invoke findMax
		int result = findMax(number1, number2);
		
		System.out.println("The maximum of " + number1 + " and " + number2 + " is " + result);
	}

	/** Return the max of two numbers */
	public static int findMax(int num1, int num2) {
		int max = num1 > num2 ? num1 : num2;
		return max;
	}
}
