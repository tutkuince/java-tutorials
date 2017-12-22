package chapter05.exercises;

public class FindPerfectNumbers2 {

	/*
	 * A positive integer is called a perfect number if it is equal to the sum
	 * of all of its positive divisors, excluding itself. For example, 6 is the
	 * first perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 +
	 * 2 + 1. There are four perfect numbers less than 10,000. Write a program
	 * to find all these four numbers.
	 */

	/** Main Method */
	public static void main(String[] args) {
		// Sum
		int sum = 0;

		// Counter
		int number = 1;

		// Find perfect number less than 10,000
		while (number < 10_000) {
			for (int i = 1; i < number; i++) {
				if (number % i == 0) {
					sum += i;
				}
			}
			if (number == sum) {
				System.out.println(number + " is a Perfect Number");
			}
			number++;
			sum = 0;
		}
	}
}
