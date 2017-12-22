package chapter02.exercises;

import java.util.Scanner;

public class ConvertPoundsToKilograms {

	/*
	 * (Convert pounds into kilograms) Write a program that converts pounds into kilograms. 
	 * The program prompts the user to enter a number in pounds,
	 * converts it to kilograms, and displays the result. 
	 * 
	 * One pound is 0.454 kilograms.
	 */
	public static void main(String[] args) {
		
		//Create scanner 
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for input
		System.out.print("Enter a number in pounds : ");
		double pounds = input.nextDouble();
		
		//Convert pounds to kilograms
		double kilograms = pounds * 0.454;
		
		//Display the result
		System.out.println(pounds + " pounds is " + kilograms + " kilograms.");
		
	}
}
