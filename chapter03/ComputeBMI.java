package chapter03;

import java.util.Scanner;

public class ComputeBMI {

	// Compute Body Mass Index
	public static void main(String[] args) {
		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Prompt user for input weight and height
		System.out.print("Enter your weight in pounds : ");
		double weight = input.nextDouble();

		System.out.print("Enter your height in inches : ");
		double height = input.nextDouble();

		//generate constant variable
		final double KILOGRAMS_PER_POUNDS = 0.45359237;
		final double METERS_PER_INCHES = 0.02554;

		// Convert inches to meter
		double meter = height * METERS_PER_INCHES;

		// Convert weights to kilograms
		double kilograms = weight * KILOGRAMS_PER_POUNDS;

		// Compute BMI
		double bmi = kilograms / Math.pow(meter, 2);

		//Display user's bmi
		System.out.println("BMI is " + bmi);
		
		//Display result
		if(bmi >= 30.0){
			System.out.println("Obese");
		}
		else if (bmi >= 25.0) {
			System.out.println("Overweight");
		}
		else if (bmi >= 18.5) {
			System.out.println("Normal");
		}
		else {
			System.out.println("Underweight");
		}
	}
}
