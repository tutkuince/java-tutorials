package chapter06.exercises;

public class PalindromicPrime {

	/*
	 * (Palindromic prime) A palindromic prime is a prime number and also
	 * palindromic. Write a program that displays the first 100 palindromic
	 * prime numbers
	 */

	/** Main method */
	public static void main(String[] args) {
		// Print palindromic primes
		printPalindromicPrimes();
	}

	/** Print palindromic prime numbers */
	public static void printPalindromicPrimes(){
		final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
		int counter = 0; // Count the number of prime numbers
		int number = 2; // A number to be tested for primeness
		
		while(counter < 100){
			if(isPrime(number) && isPalindromic(number)){
				if(counter % NUMBER_OF_PRIMES_PER_LINE == 0){
					System.out.println();
				}
				System.out.printf("%6d", number);
				counter++;  // Increase counter
			}
			number++;
		}
	}

	/** Check number is prime or not */
	public static boolean isPrime(int number) {

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	/** Check number is palindromic or not */
	public static boolean isPalindromic(int number) {

		return (number == reverse(number));
	}

	/** Return reverse number from parameter */
	public static int reverse(int number) {
		String reverseNum = "";
		String strNumber = String.valueOf(number);

		for (int i = 0; i < strNumber.length(); i++) {
			reverseNum = strNumber.charAt(i) + reverseNum;
		}

		return Integer.parseInt(reverseNum);
	}
}
