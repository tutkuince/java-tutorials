package chapter06.exercises;

import java.util.Scanner;

public class ConvertMilisecondsToHourMinSec {

	/*
	 * (Convert milliseconds to hours, minutes, and seconds) Write a method that
	 * converts milliseconds to hours, minutes, and seconds
	 */

	/** Main method */
	public static void main(String[] args) {
		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter milliseconds
		System.out.print("Enter milliseconds for convert to hours, minutes, and seconds : ");
		long milliseconds = input.nextLong();

		// Invoke convertMillis method
		System.out.println(convertMillis(milliseconds));
	}

	/** Convert milliseconds to hours, minutes, and seconds */
	public static String convertMillis(long millis) {
		int hours = 0;
		int minutes = 0;
		int seconds = 0;

		final int PER_HOUR_OF_MILLISECONDS = 36000;
		final int PER_MINUTES_OF_MILLISECONDS = 6000;
		final int PER_SECONDS_OF_MILLISECONDS = 100;

		while (millis > 0) {
			if (millis > PER_HOUR_OF_MILLISECONDS) {
				hours = (int) (millis / PER_HOUR_OF_MILLISECONDS);
				millis %= PER_HOUR_OF_MILLISECONDS;
			} else if (millis > PER_MINUTES_OF_MILLISECONDS) {
				minutes = (int) (millis / PER_MINUTES_OF_MILLISECONDS);
				millis %= PER_MINUTES_OF_MILLISECONDS;
			} else {
				seconds = (int) (millis / PER_SECONDS_OF_MILLISECONDS);
				millis %= PER_SECONDS_OF_MILLISECONDS;
			}
		}

		return hours + ":" + minutes + ":" + seconds;
	}
}
