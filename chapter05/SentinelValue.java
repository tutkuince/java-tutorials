package chapter05;

import java.util.Scanner;

public class SentinelValue {
	/** Main Method */
	public static void main(String[] args) {
		// Create Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Message for user
		String message = "Enter an integer (the input ends if it is 0) : ";
		
		// Prompt the user to enter a number
		System.out.print(message);
		int number = input.nextInt();
		
		// Keep reading data until the input is 0
		int sum = 0;
		while(number != 0){
			sum += number;
			System.out.print(message);
			number = input.nextInt();
		}
		
		// Display the result
		System.out.println("The sum is " + sum);
	}
}
