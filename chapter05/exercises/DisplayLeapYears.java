package chapter05.exercises;

public class DisplayLeapYears {

	/*
	 (Display leap years) Write a program that displays all the leap years,
	 ten per line, from 101 to 2100, separated by exactly one space.
	  
	 A year is a leap year if it is divisible by 4 but not by 100, or if it is
	 divisible by 400.
	 */

	/** Main Method */
	public static void main(String[] args) {

		// Display 10 leap year per line
		final int NUMBER_OF_LEAP_YEAR_PER_LINE = 10;
		
		// Counter
		int counter = 0;
		
		// Find leap years 101 to 2100
		for (int i = 101; i < 2100; i++) {
			if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0){
				if(counter % NUMBER_OF_LEAP_YEAR_PER_LINE == 0){
					System.out.println();
				}
				System.out.printf("%5d", i); // Display the result
				counter++;
			}
		}
	}
}
