package chapter05;

public class FutureTuition {

	/*
	 * Suppose that the tuition for a university is $10,000 this year and
	 * tuition increases 7% every year.
	 * 
	 * Keep computing the tuition for a new year until it is at least 20000. By
	 * then you will know how many years it will take for the tuition to be
	 * doubled.
	 */
	/** Main Method */
	public static void main(String[] args) {
		// Tuition for a university is $10,000
		double tuition = 10000;

		// Total year
		int year = 0;

		while (tuition < 20000) {
			tuition *= 1.07;
			year++;
		}
		// Display the Tuition will be doubled
		System.out.println("Tuition will be doubled in " + year + " years");

		// Display the result
		System.out.println("Tuition will be $" + (int) (tuition * 100) / 100.0 + " in " + year + " years.");
	}
}
