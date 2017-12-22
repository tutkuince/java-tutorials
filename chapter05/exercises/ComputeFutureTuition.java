package chapter05.exercises;

public class ComputeFutureTuition {
	/*
	 * Suppose that the tuition for a university is $10,000 this year and
	 * increases 5% every year. In one year, the tuition will be $10,500. Write
	 * a program that computes the tuition in
	 */
	/** Main Method */
	public static void main(String[] args) {

		// Start Tuition
		double tuition = 10000;

		// Compute tuition for per year
		for (int i = 0; i < 10; i++) {
			tuition = (tuition * 1.05);
		}

		// Display the result
		System.out.println("The total tuition is " + (int) (tuition * 100) / 100.0 + " in 10 years.");
	}
}
