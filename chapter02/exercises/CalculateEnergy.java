package chapter02.exercises;

import java.util.Scanner;

public class CalculateEnergy {

	/*
	 * (Science: calculating energy) Write a program that calculates the energy
	 * needed to heat water from an initial temperature to a final temperature.
	 * Your program should prompt the user to enter the amount of water in
	 * kilograms and the initial and final temperatures of the water. 
	 * The formula to compute the energy is
	 *  
	 * Q = M * (finalTemperature – initialTemperature) * 4184 
	 * 
	 * where M is the weight of water in kilograms,
	 * temperatures are in degrees Celsius, and energy Q is measured in joules.
	 */
	public static void main(String[] args) {
		
		//Create Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//Prompt user for input
		System.out.print("Enter the amount of water in kilograms : ");
		double amountOfWater = input.nextDouble();
		
		System.out.print("Enter the initial temperatures of water : ");
		double initialTemperatures = input.nextDouble();
		
		System.out.print("Enter the final temperatures of water : ");
		double finalTemperatures = input.nextDouble();
		
		//Calculate Energy
		double energy = amountOfWater * (finalTemperatures - initialTemperatures) * 4184;
		
		//Display the result
		System.out.println("The energy needed is " + energy);
	}
}
