package chapter06.exercises;

public class DisplayEmirp {

	/*
	 * (Emirp) An emirp (prime spelled backward) is a nonpalindromic prime
	 * number whose reversal is also a prime. For example, 17 is a prime and 71
	 * is a prime, so 17 and 71 are emirps. Write a program that displays the
	 * first 100 emirps. Display 10 numbers per line,
	 */

	/** Main method */
	public static void main(String[] args) {

		// Print emirp numbers
		printEmirp();
	}

	/** Print emirp numbers */
	public static void printEmirp() {
		final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
		int counter = 0; // Count the number of prime numbers
		int number = 2; // A number to be tested for primeness

		while (counter < 100) {
			if (isEmirp(number)) {
				if (counter % NUMBER_OF_PRIMES_PER_LINE == 0) {
					System.out.println();
				}
				System.out.printf("%6d", number);
				counter++;
			}
			number++;
		}
	}

	/** Return boolean value if number is emirp */
	public static boolean isEmirp(int number) {
		return !isPalindromic(number) && isPrime(number) && isPrime(reverse(number));
	}

	/** Return boolean value if number is prime */
	public static boolean isPrime(int number) {
		// Find prime numbers
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	/** Return reverse value of number */
	public static int reverse(int number) {
		String reverseNumber = "";
		String strNumber = String.valueOf(number);

		// Reverse
		for (int i = 0; i < strNumber.length(); i++) {
			reverseNumber = strNumber.charAt(i) + reverseNumber;
		}
		return Integer.parseInt(reverseNumber);
	}

	/** Return boolean value if number is palindromic */
	public static boolean isPalindromic(int number) {
		return reverse(number) == number;
	}
}
