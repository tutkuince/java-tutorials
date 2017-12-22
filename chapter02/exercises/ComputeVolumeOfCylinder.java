package chapter02.exercises;

import java.util.Scanner;

public class ComputeVolumeOfCylinder {

	/*
	 * (Compute the volume of a cylinder) Write a program that reads in the
	 * radius and length of a cylinder and computes the area and volume using
	 * the following formulas:
	 * 
	 * area = radius * radius * pi
	 * volume = area * length
	 */
	public static void main(String[] args) {
		
		//Create Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for radius
		System.out.print("Enter radius of a cylinder: ");
		double radius = input.nextDouble();
		
		//Prompt the user for length
		System.out.print("Enter the lenght of a cylinder: ");
		double length = input.nextDouble();
		
		//Compute the area
		double area = Math.pow(radius, 2) * 3.14;
		
		//Compute the Volume
		double volume = area * length;
		
		//Display the results
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);	
	}
}
