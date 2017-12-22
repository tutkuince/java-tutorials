package chapter03;

import java.util.Scanner;

public class LeapYear {

	/*
	 *A year is a leap year if it is divisible by 4 but not by 100, or if it is divisible by 400.
	 * 
	 */
	public static void main(String[] args) {
		
		//Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter year
		System.out.print("Enter a year : ");
		int year = input.nextInt();
		
		//Check if the year is leap year
		boolean isLeapYear = false;
		
		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
			isLeapYear = true;
		}
		
		//Display the result 
		System.out.println(year + " is a leap year? " + isLeapYear);
	}
}
