package chapter02;

import java.util.Scanner;


public class DisplayTime {

	/*
	 * The program in Listing 2.5 obtains minutes and remaining seconds from
	 * an amount of time in seconds. For example, 500 seconds contains 8
	 * minutes and 20 seconds.
	 */
	public static void main(String[] args) {
		
		//Create Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for input
		System.out.print("Enter an integer for seconds : ");
		int seconds = input.nextInt();
		
		//Find minutes in seconds 
		int minutes = seconds / 60;
		
		//Seconds remaining
		int reamaingSeconds = seconds % 60;
		
		System.out.println(seconds + " is " + minutes + " minutes and " + reamaingSeconds + " seconds");
		
	}
}
