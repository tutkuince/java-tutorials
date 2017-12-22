package chapter03.exercises;

import java.util.Scanner;

public class PalindromeNumber {

	/*
	 * Write a program that prompts the user to enter a three-digit integer and
	 * determines whether it is a palindrome number. A number is palindrome if
	 * it reads the same from right to left and from left to right.
	 */
	public static void main(String[] args) {
		//Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a three-digit integer
		System.out.print("Enter a three-digit integer : ");
		int number = input.nextInt();
		
		//Find the digits
		int firstDigit = number / 100;
		int lastDigit = number % 10;
		
		//Display the result
		if (firstDigit == lastDigit) {
			System.out.println(number + " is a palindrome");
		}else{
			System.out.println(number + " is not a palindrome");
		}
	}
}
