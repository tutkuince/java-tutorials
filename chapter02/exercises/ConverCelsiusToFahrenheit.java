package chapter02.exercises;

import java.util.Scanner;

public class ConverCelsiusToFahrenheit {

	/*
	 * (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a double value from the console, 
	 * then converts it to Fahrenheit and displays the result. The formula for the conversion is as follows:
	 * 
	 * fahrenheit = (9 / 5) * celsius + 32 
	 * 
	 * Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
	 */
	public static void main(String[] args) {
	
		//Create Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for input
		System.out.print("Enter celsius for fahrenheit : ");
		double celsius = input.nextDouble();
		
		//Compute fahrenheit
		double fahrenheit = (9.0 / 5) * celsius + 32;
		
		//display the result
		System.out.println(celsius + " is " + fahrenheit);
	}
}
