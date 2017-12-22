package chapter02;

import java.util.Scanner;

public class ComputeAverage {
	public static void main(String[] args) {
		double number1;
		double number2;
		double number3;
		double average;
		
		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter first number
		System.out.print("Enter first number for average : ");
		number1 = input.nextDouble();

		// Prompt the user to enter second number
		System.out.print("\nEnter second number for average : ");
		number2 = input.nextDouble();

		// Prompt the user to enter third number
		System.out.print("\nEnter third number for average : ");
		number3 = input.nextDouble();
		
		//Compute average
		average = (number1 + number2 + number3) / 3;
		
		//Display result
		System.out.println("The average : " + average);
	}
}
