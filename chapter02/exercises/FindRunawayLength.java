package chapter02.exercises;

import java.util.Scanner;

public class FindRunawayLength {

	/*
	 * (Physics: finding runway length) Given an airplane’s acceleration a and take-off
		speed v, you can compute the minimum runway length needed for an airplane to
		take off using the following formula:
		
		length = v * v / 2a
		Write a program that prompts the user to enter v in meters/second (m/s) and the
		acceleration a in meters/second squared (m/s2), and displays the minimum runway
		length.
	 * */
	public static void main(String[] args) {
		
		//Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//Prompt user for input
		System.out.print("Enter speed(v) in m/s ");
		int speed = input.nextInt();
		
		System.out.print("Enter acceleration(a) in m/s2 ");
		double acceleration = input.nextDouble();
		
		//Calculate minimum runway length
		double length = Math.pow(speed, 2) / (2 * acceleration);
		
		System.out.println("The minimum runway lenght is : " + (int)(length * 1000) / 1000.0);
	}
}
