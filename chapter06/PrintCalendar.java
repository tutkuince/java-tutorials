package chapter06;

import java.util.Scanner;

public class PrintCalendar {

	/** Main method */
	public static void main(String[] args) {
		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter year
		System.out.print("Enter full year (e.g, 2012) : ");
		int year = input.nextInt();

		// Prompt the user to enter month 1 to 12
		System.out.print("Enter month as number 1 to 12 : ");
		int month = input.nextInt();

		// Print calendar for the month of year
		printCalendar(year, month);
	}

	/** Print calendar for a month in year */
	private static void printCalendar(int year, int month) {
		// Print header of calendar
		printMonthTitle(year, month);

		// Print body of calendar
		printMonthBody(year, month);
	}

	/** Print month title */
	private static void printMonthTitle(int year, int month) {
		System.out.println("\t" + getMonthName(month) + " " + year);
		System.out.println("---------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}

	/** Get month name for month */
	private static String getMonthName(int month) {
		String monthName = "";
		switch (month) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
			break;
		}
		return monthName;
	}

	/** Print month body */
	private static void printMonthBody(int year, int month) {

		// Get start day of the week for the first date in the month
		int startDay = getStartDay(year, month);

		// Get number of days in month
		int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

		for (int i = 0; i < startDay; i++) {
			System.out.print("    ");
		}

		for (int i = 1; i <= numberOfDaysInMonth; i++) {
			System.out.printf("%4d", i);
			if ((i + startDay) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

	/** Get start day of the week for the first date in the month */
	private static int getStartDay(int year, int month) {
		final int START_DAY_OF_JAN_1_1800 = 3;

		// Get total number of days
		int totalNumberOfDays = getTotalNumberOfDays(year, month);

		// Return the start day for month
		return (totalNumberOfDays + START_DAY_OF_JAN_1_1800) % 7;
	}

	/** Get total number of days */
	private static int getTotalNumberOfDays(int year, int month) {
		int total = 0;

		// Get total days from 1/1/1800
		for (int i = 1800; i < year; i++) {
			if (isLeapYear(i)) {
				total += 366;
			} else {
				total += 365;
			}
		}

		// Add days from January to the month prior to the calendar month
		for (int i = 1; i < month; i++) {
			total += getNumberOfDaysInMonth(year, i);
		}
		return total;
	}

	/** Get number of days in month */
	private static int getNumberOfDaysInMonth(int year, int i) {
		if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
			return 31;
		} else if (i == 4 || i == 6 || i == 9 || i == 11) {
			return 30;
		} else if (i == 2) {
			return isLeapYear(year) ? 29 : 28;
		} else {
			return 0; // If month is incorrect
		}
	}

	/** Check year is leap or not */
	private static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}
}
