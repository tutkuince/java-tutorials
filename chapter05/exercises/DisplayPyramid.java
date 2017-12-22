package chapter05.exercises;

import java.util.Scanner;

public class DisplayPyramid {

	/*
	 		1
		  2 1 2
		3 2 1 2 3
	  4 3 2 1 2 3 4
	5 4 3 2 1 2 3 4 5
  6 5 4 3 2 1 2 3 4 5 6
7 6 5 4 3 2 1 2 3 4 5 6 7

Write a program that prompts the user to enter an integer from
1 to 15 and displays a pyramid
  */
	
	
	/** Main Method */
	public static void main(String[] args) {
	
		//Create Scanner 
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter an integer from 1 to 15
		System.out.print("Enter an integer from 1 to 10 : ");
		
		int number = input.nextInt();
		
		// Display pattern
		for (int i = 1; i <= number; i++) {
			
			for (int j = 1; j <= 10 - i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j > 0; j--) {
				System.out.printf("%d", j);
			}
			for (int j = 2; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
