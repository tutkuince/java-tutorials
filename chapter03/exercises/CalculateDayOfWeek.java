package chapter03.exercises;

import java.util.Scanner;

public class CalculateDayOfWeek {

	/*
	 * Zeller’s congruence is an algorithm developed by Christian Zeller to
	 * calculate the day of the week.
	 * 
	 * h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday,
	 * 4: Wednesday, 5: Thursday, 6: Friday).
	 * 
	 * q is the day of the month.
	 * 
	 * m is the month (3: March, 4: April, …, 12: December). January and
	 * February are counted as months 13 and 14 of the previous year.
	 * 
	 * j is the century(year/100)
	 *
	 * k is the year of the century (i.e., year % 100).
	 */
	public static void main(String[] args) {
		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Propmt the user to enter year
		System.out.print("Enter year : ");
		int year = input.nextInt();

		// Prompt the user to enter month
		System.out.print("Enter month : ");
		int month = input.nextInt();
		if (month == 1) {
			month = 13;
		}else if(month == 2){
			month = 14;
		}

		// Prompt the user to enter day of the month
		System.out.print("Enter the day of the month : ");
		int dayOfMonth = input.nextInt();

		// Calculate Century
		int century = year / 100;

		// Calculate year of century
		int yearOfCentury = year % 100;

		// Calculate Day of the week
		int dayOfWeek = (dayOfMonth + (26 * (month + 1) / 10) + yearOfCentury + (yearOfCentury / 4) + (century / 4)
				+ (5 * century)) % 7;

		// Generate day of week day's name
		String dayOfWeekName = null;
		switch (dayOfWeek) {
		case 0:
			dayOfWeekName = "Saturday";
			break;
		case 1:
			dayOfWeekName = "Sunday";
			break;
		case 2:
			dayOfWeekName = "Monday";
			break;
		case 3:
			dayOfWeekName = "Tuesday";
			break;
		case 4:
			dayOfWeekName = "Wednesday";
			break;
		case 5:
			dayOfWeekName = "Thursday";
			break;
		case 6:
			dayOfWeekName = "Friday";
			break;
		}
		
		//Display the result
		System.out.println("Day of the week is " + dayOfWeekName);
	}
}
