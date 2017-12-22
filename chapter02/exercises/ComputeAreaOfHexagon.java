package chapter02.exercises;

import java.util.Scanner;

public class ComputeAreaOfHexagon {

	/*
	 * (Geometry: area of a hexagon) Write a program that prompts the user to
	 * enter the side of a hexagon and displays its area. The formula for
	 * computing the area of a hexagon is
	 * Area = (((27)1/2)/2) * s2
	 * where s is the length of a side.
	 */
	public static void main(String[] args) {
		//Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//Prompt user for input
		System.out.print("Enter the side of a hexagon : ");
		double sideOfHexagon = input.nextDouble();
		
		//Compute Area of a Hexagon
		double area = Math.pow(27, 0.5) / 2 * Math.pow(sideOfHexagon, 2);
		
		//Display the result 
		System.out.println("Area of hexagon is " + (int)(area * 10000) / 10000.0);
	}
}
