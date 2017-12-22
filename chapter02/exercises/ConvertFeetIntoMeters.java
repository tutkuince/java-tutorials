package chapter02.exercises;

import java.util.Scanner;

public class ConvertFeetIntoMeters {

	/*
	 * (Convert feet into meters) Write a program that reads a number in feet,
	 * converts it to meters, and displays the result. One foot is 0.305 meter.
	 */
	public static void main(String[] args) {
		
		//Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for input
		System.out.print("Enter a value for feet : ");
		
		double feet = input.nextDouble();
		
		//Compute meters
		double meters = feet * 0.305;
		
		//Display the result
		System.out.println(feet + " feet is " + meters + " meters");
	}
}
