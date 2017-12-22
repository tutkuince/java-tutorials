package chapter05.exercises;

import java.util.Scanner;

public class FindPerfectNumbers {

	/*
	 * A positive integer is called a perfect number if it is equal to the sum
	 * of all of its positive divisors, excluding itself. For example, 6 is the
	 * first perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 +
	 * 2 + 1. There are four perfect numbers less than 10,000. Write a program
	 * to find all these four numbers.
	 */

	/** Main Method */
	public static void main(String[] args) {
		// Create Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter an integer
		System.out.print("Enter an integer : ");
		int number = input.nextInt();

		// Sum
		int sum = 0;

		// Find Perfect Numbers and Display
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		if (sum == number) {
			System.out.println(number + " is a Perfect Number");
		} else {
			System.out.println(number + " is not a Perfect Number");
		}
	}
}
