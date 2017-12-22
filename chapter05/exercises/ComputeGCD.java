package chapter05.exercises;

import java.util.Scanner;

public class ComputeGCD {

	// (Compute the greatest common divisor)

	/** Main Method */
	public static void main(String[] args) {
		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter first number
		System.out.print("Enter the first number : ");
		int number1 = input.nextInt();
		
		// Prompt the user to enter first number
		System.out.print("Enter the second number : ");
		int number2 = input.nextInt();
		
		// Initial gcd
		int gcd = 1;
		
		// Possible gcd 
		int k = 2;
		
		// Compute gcd
		while(number1 >= k && number2 >= k){
			if(number1 % k == 0 && number2 % k == 0){
				gcd = k;
			}
			k++;
		}
		
		// Display the result
		System.out.println("The greatest common diveser for" + number1 + " and " + number2 + " is " + gcd);
	}
}
