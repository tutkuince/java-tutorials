package chapter03.exercises;

import java.util.Scanner;

public class SumThreeInteger {

	/*
	 * generate three single-digit integers and prompt the user to enter the sum
	 * of these three integers.
	 */
	public static void main(String[] args) {
		// Create Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Generate 3 integer
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		int number3 = (int) (Math.random() * 10);

		// Prompt the user to enter the sum of 3 integers
		System.out.print(number1 + " + " + number2 + " + " + number3 + " = ?");
		int result = input.nextInt();

		if (result == (number1 + number2 + number3)) {
			System.out.println("Your answer is true. Result is " + result);
		} else {
			System.out.println("Your anwser is false. Result is " + (number1 + number2 + number3));
		}
	}
}
