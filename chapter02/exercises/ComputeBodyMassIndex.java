package chapter02.exercises;

import java.util.Scanner;

public class ComputeBodyMassIndex {

	/*
	 * (Health application: computing BMI) Body Mass Index (BMI) is a measure of
	 * health on weight. It can be calculated by taking your weight in kilograms
	 * and dividing by the square of your height in meters. Write a program that
	 * prompts the user to enter a weight in pounds and height in inches and
	 * displays the BMI. Note that one pound is 0.45359237 kilograms and one
	 * inch is 0.0254 meters.
	 */
	
	public static void main(String[] args) {
		//Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//Prompt user for input 
		System.out.print("Enter weight in pounds : ");
		double weight = input.nextDouble();
		
		System.out.print("Enter height in inches : ");
		double inch = input.nextDouble();
		
		//Convert weights to kilograms 
		double kilograms = weight * 0.45359237;
		
		//Convert inches to meters
		double meters = inch * 0.0254;
		
		//Calculate BMI
		double bodyMassIndex = kilograms / Math.pow(meters, 2);
		
		//Display result
		System.out.println("BMI is " + (int)(bodyMassIndex * 10000) / 10000.0);
		
	}
}
