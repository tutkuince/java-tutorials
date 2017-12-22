package chapter05.exercises;

public class DisplayPrimeNumbers {

	/*
	 * Display prime numbers between 2 and 1000
	 */
	
	/** Main Method */
	public static void main(String[] args) {
		
		// Display 8 numbers per line
		final int NUMBER_OF_PRIMES_PER_LINE = 8;
		
		// Counter
		int counter = 0;
		
		// Find prime numbers 
		boolean isPrime = true;
		for (int i = 2; i < 1000; i++) {
			for (int j = 2; j <= i / 2; j++) {
				if(i % j == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				if(counter % NUMBER_OF_PRIMES_PER_LINE == 0){
					System.out.println();
				}
				System.out.printf("%4d ", i); // Display result
				counter++;
			}
			isPrime = true;
		}
	}
}
