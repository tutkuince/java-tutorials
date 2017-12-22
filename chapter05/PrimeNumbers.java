package chapter05;

public class PrimeNumbers {
	/** Main Method */
	public static void main(String[] args) {

		// Number of primes to display
		final int NUMBER_OF_PRIMES = 50;

		// Display 10 per line
		final int NUMBER_OF_PRIMES_PER_LINE = 10;

		// A number to be tested for primeness
		int number = 2;

		// Count the number of prime numbers
		int counter = 0;

		// Find prime numbers
		boolean isPrime = true;
		while (counter < NUMBER_OF_PRIMES) {

			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				if (counter % NUMBER_OF_PRIMES_PER_LINE == 0) {
					System.out.println(); // next line
				}
				System.out.print(number + " "); // Display the result
				counter++;
			}
			isPrime = true;
			number++;
		}
	}
}
