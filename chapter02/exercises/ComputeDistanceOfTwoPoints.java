package chapter02.exercises;

import java.util.Scanner;

public class ComputeDistanceOfTwoPoints {

	/*
	 * (Geometry: distance of two points) Write a program that prompts the user
	 * to enter two points (x1, y1) and (x2, y2) and displays their distance
	 * between them. The formula for computing the distance is 
	 * (((x2 - x1)2) + ((y2 - y1)2))1/2.
	 */
	public static void main(String[] args) {
		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Promt user for input
		System.out.print("Enter x1 : ");
		double x1 = input.nextDouble();

		System.out.print("Enter y1 : ");
		double y1 = input.nextDouble();

		System.out.print("Enter x2 : ");
		double x2 = input.nextDouble();

		System.out.print("Enter y2 : ");
		double y2 = input.nextDouble();

		// Compute distance
		double distance = Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), 0.5);
		
		//Display result
		System.out.println("The distance between the two points is " + distance);
	}
}
