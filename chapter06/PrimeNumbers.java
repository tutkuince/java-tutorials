package chapter06;

public class PrimeNumbers {

	/** Main method */
	public static void main(String[] args) {

		// Display message
		System.out.println("The first 50 prime numbers are");

		// Invoke printPrimeNumbers method
		printPrimeNumbers();
	}

	/** Print prime numbers 2 to 50 and 5 prime numbers must be per line */
	public static void printPrimeNumbers() {

		// 5 prime numbers for per line
		final int NUMBER_OF_PRIMES_PER_LINE = 5;

		// Counter
		int counter = 0;

		// A number to be tested for primes
		int number = 2;

		// Find prime numbers
		boolean isPrime = true;
		while (counter < 50) {
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				if (counter % NUMBER_OF_PRIMES_PER_LINE == 0) {
					// Print the number and advance to the new line
					System.out.println();
				}
				System.out.printf("%4d", number); // Display the result
				counter++; // Increase count
			}
			isPrime = true;
			number++; // Check whether the next number is prime
		}
	}
}
