package chapter02.exercises;

import java.util.Scanner;

public class PopulationProjection {

	/*
	  	The U.S. Census Bureau projects population based on the following assumptions:
	 		* One birth every 7 seconds
	 		* One death every 13 seconds
	 		* One new immigrant every 45 seconds
		Prompt the user to enter the number of years and displays the population after the number of years. 
		Assume the current population is 312,032,486 and one year has 365 days.
	 */
	public static void main(String[] args) {
		
		//Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double currentPopulation = 312032486;
		
		//Prompt the user for input
		System.out.print("Enter the number of years : ");
		int numberOfYears = input.nextInt();
		
		//Calculate seconds in user input
		double totalSecondsInYear = 365 * 24 * 60 * numberOfYears;
		
		int oneBirth = (int)totalSecondsInYear / 7;
		int oneDeath = (int)totalSecondsInYear / 13;
		int oneNewImmigrant = (int)totalSecondsInYear / 45;
		
		currentPopulation = currentPopulation + oneBirth - oneDeath + oneNewImmigrant;
		
		System.out.println("The population in " + numberOfYears + " year(s) is " + (int)currentPopulation);
	}
}
