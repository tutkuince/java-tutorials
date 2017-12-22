package chapter03;

import java.util.Scanner;

public class SimpleIfDemoHi5 {
	/*
	 * A program that prompts the user to enter an integer. 
	 * If the number is a multiple of 5, the program displays HiFive. 
	 * If the number is divisible by 2, it displays HiEven.
	 */
	public static void main(String[] args) {
		//Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//Propmt user for input
		System.out.print("Enter an integer : ");
		int number = input.nextInt();
		
		//Check 5
		if (number % 5 == 0) {
			System.out.println("HiFive");
		}
		//Check 2
		if (number % 2 == 0) {
			System.out.println("HiEven");
		}
	}
}
