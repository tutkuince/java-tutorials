package chapter02.exercises;

import java.util.Scanner;

public class ComputeAverageAcceleration {

	/*
	 * (Physics: acceleration) Average acceleration is defined as the change of
	 * velocity divided by the time taken to make the change, as shown in the
	 * following formula:
	 * 
	 * a = (v1 - v0) / t
	 * 
	 * Write a program that prompts the user to enter the starting velocity v0
	 * in meters/ second, the ending velocity v1 in meters/second, and the time
	 * span t in seconds, and displays the average acceleration.
	 */
	public static void main(String[] args) {
		
		//Create Scanner 
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//Prompt user for input
		System.out.print("Enter V0 : ");
		double v0 = input.nextDouble();
		
		System.out.print("Enter V1 : ");
		double v1 = input.nextDouble();
		
		System.out.print("Enter t : ");
		double time = input.nextDouble();
		
		//Compute average acceleration
		double average = (v1 - v0) / time;
		
		System.out.println("The average acceleration : " + (int)(average * 10000) / 10000.0);
	}
}
