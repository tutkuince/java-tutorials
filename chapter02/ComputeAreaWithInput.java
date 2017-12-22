package chapter02;

import java.util.Scanner;

public class ComputeAreaWithInput {

	public static void main(String[] args) {
		double radius;
		double area;
		
		//Create Scanner object
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a radius
		System.out.print("Enter a number for radius : ");
		radius = input.nextDouble();
		
		//Compute area
		area = radius * radius * 3.14;
		
		//Display result
		System.out.println("The area for the circle : " + area);
	}
}
