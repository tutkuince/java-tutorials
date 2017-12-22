package chapter02.exercises;

import java.util.Scanner;

public class SumTheDigits {

	/*
	 * (Sum the digits in an integer) Write a program that reads an integer
	 * between 0 and 1000 and adds all the digits in the integer. 
	 * For example, if an integer is 932, the sum of all its digits is 14.
	 *  
	 * Hint: Use the % operator to extract digits, and use the / operator to remove the extracted digit. 
	 * 
	 * For instance, 932 % 10 = 2 and 932 / 10 = 93.
	 */
	public static void main(String[] args) {
		
		//Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//Prompt user for input
		System.out.print("Enter an integer between 0 and 1000 : ");
		int number = input.nextInt();
		
		//find first number
		int firstNumber = number / 100;
		
		//remaing number
		int remaingNumber = number - (firstNumber * 100);
		
		//find second number
		int secondNumber = remaingNumber / 10;
		remaingNumber = remaingNumber - (secondNumber * 10);
		
		//find third number
		int thirdNumber = remaingNumber;
		
		System.out.println("The sum of digits is " + (firstNumber + secondNumber + thirdNumber));
	}
}
