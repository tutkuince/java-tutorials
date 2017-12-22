package chapter05;

public class PrimeNumber {

	/** Main Method*/
	public static void main(String[] args) {
		
		boolean isPrime = true;
		for (int i = 2; i < 50; i++) {
			for (int j = 2; j < i; j++) {
				if(i % j == 0){
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(i);
			}
			isPrime = true;
		}
	}
}
