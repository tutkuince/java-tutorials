package chapter03.exercises;

import java.util.Scanner;

public class FindFutureDates {

	/*
	 * Write a program that prompts the user to enter an integer for today’s day
	 * of the week (Sunday is 0, Monday is 1, …, and Saturday is 6). Also prompt
	 * the user to enter the number of days after today for a future day and
	 * display the future day of the week.
	 */
	public static void main(String[] args) {
		//Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter today's day
		System.out.print("Enter today's day : ");
		int numberOfDayOfWeek = input.nextInt();
		
		//Prompt the user to enter the number of days after today for a future day
		System.out.print("Enter the number of days elapsed since today : ");
		int numberOfFutureDay = input.nextInt();
		
		String dayOfWeek = null;
		String futureDay = null;
		
		//Calculate dayOfWeek and futureDay
		if (numberOfDayOfWeek == 0) {
			dayOfWeek = "Sunday";
			numberOfFutureDay = (numberOfFutureDay + numberOfDayOfWeek) % 7;
			if(numberOfFutureDay == 0){
				futureDay = "Sunday";
			}else if(numberOfFutureDay == 1){
				futureDay = "Monday";
			}else if(numberOfFutureDay == 2){
				futureDay = "Tuesday";
			}else if(numberOfFutureDay == 3){
				futureDay = "Wednesday";
			}else if(numberOfFutureDay == 4){
				futureDay = "Thursday";
			}else if(numberOfFutureDay == 5){
				futureDay = "Friday";
			}else if(numberOfFutureDay == 6){
				futureDay = "Saturday";
			}
		}else if (numberOfDayOfWeek == 1) {
			dayOfWeek = "Monday";
			numberOfFutureDay = (numberOfFutureDay + numberOfDayOfWeek) % 7;
			if(numberOfFutureDay == 0){
				futureDay = "Sunday";
			}else if(numberOfFutureDay == 1){
				futureDay = "Monday";
			}else if(numberOfFutureDay == 2){
				futureDay = "Tuesday";
			}else if(numberOfFutureDay == 3){
				futureDay = "Wednesday";
			}else if(numberOfFutureDay == 4){
				futureDay = "Thursday";
			}else if(numberOfFutureDay == 5){
				futureDay = "Friday";
			}else if(numberOfFutureDay == 6){
				futureDay = "Saturday";
			}
		}else if (numberOfDayOfWeek == 2) {
			dayOfWeek = "Tuesday";
			numberOfFutureDay = (numberOfFutureDay + numberOfDayOfWeek) % 7;
			if(numberOfFutureDay == 0){
				futureDay = "Sunday";
			}else if(numberOfFutureDay == 1){
				futureDay = "Monday";
			}else if(numberOfFutureDay == 2){
				futureDay = "Tuesday";
			}else if(numberOfFutureDay == 3){
				futureDay = "Wednesday";
			}else if(numberOfFutureDay == 4){
				futureDay = "Thursday";
			}else if(numberOfFutureDay == 5){
				futureDay = "Friday";
			}else if(numberOfFutureDay == 6){
				futureDay = "Saturday";
			}
		}else if (numberOfDayOfWeek == 3) {
			dayOfWeek = "Wednesday";
			numberOfFutureDay = (numberOfFutureDay + numberOfDayOfWeek) % 7;
			if(numberOfFutureDay == 0){
				futureDay = "Sunday";
			}else if(numberOfFutureDay == 1){
				futureDay = "Monday";
			}else if(numberOfFutureDay == 2){
				futureDay = "Tuesday";
			}else if(numberOfFutureDay == 3){
				futureDay = "Wednesday";
			}else if(numberOfFutureDay == 4){
				futureDay = "Thursday";
			}else if(numberOfFutureDay == 5){
				futureDay = "Friday";
			}else if(numberOfFutureDay == 6){
				futureDay = "Saturday";
			}
		}else if (numberOfDayOfWeek == 4) {
			dayOfWeek = "Thursday";
			numberOfFutureDay = (numberOfFutureDay + numberOfDayOfWeek) % 7;
			if(numberOfFutureDay == 0){
				futureDay = "Sunday";
			}else if(numberOfFutureDay == 1){
				futureDay = "Monday";
			}else if(numberOfFutureDay == 2){
				futureDay = "Tuesday";
			}else if(numberOfFutureDay == 3){
				futureDay = "Wednesday";
			}else if(numberOfFutureDay == 4){
				futureDay = "Thursday";
			}else if(numberOfFutureDay == 5){
				futureDay = "Friday";
			}else if(numberOfFutureDay == 6){
				futureDay = "Saturday";
			}
		}else if (numberOfDayOfWeek == 5) {
			dayOfWeek = "Friday";
			numberOfFutureDay = (numberOfFutureDay + numberOfDayOfWeek) % 7;
			if(numberOfFutureDay == 0){
				futureDay = "Sunday";
			}else if(numberOfFutureDay == 1){
				futureDay = "Monday";
			}else if(numberOfFutureDay == 2){
				futureDay = "Tuesday";
			}else if(numberOfFutureDay == 3){
				futureDay = "Wednesday";
			}else if(numberOfFutureDay == 4){
				futureDay = "Thursday";
			}else if(numberOfFutureDay == 5){
				futureDay = "Friday";
			}else if(numberOfFutureDay == 6){
				futureDay = "Saturday";
			}
		}else if (numberOfDayOfWeek == 6) {
			dayOfWeek = "Saturday";
			numberOfFutureDay = (numberOfFutureDay + numberOfDayOfWeek) % 7;
			if(numberOfFutureDay == 0){
				futureDay = "Sunday";
			}else if(numberOfFutureDay == 1){
				futureDay = "Monday";
			}else if(numberOfFutureDay == 2){
				futureDay = "Tuesday";
			}else if(numberOfFutureDay == 3){
				futureDay = "Wednesday";
			}else if(numberOfFutureDay == 4){
				futureDay = "Thursday";
			}else if(numberOfFutureDay == 5){
				futureDay = "Friday";
			}else if(numberOfFutureDay == 6){
				futureDay = "Saturday";
			}
		}
		//Display the result
		System.out.println("Today is " + dayOfWeek + " and the future day is " + futureDay);
	}
}
