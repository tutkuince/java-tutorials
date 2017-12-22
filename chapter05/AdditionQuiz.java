package chapter05;

import java.util.Scanner;

public class AdditionQuiz {

	public static void main(String[] args) {
		// Create Scanner 
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Generate random numbers for intergers
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		// Prompt the user to enter addition result
		System.out.print(number1 + " + " + number2 + " = ? ");
		int result = input.nextInt();
		
		// If user make mistake, answer the question again.
		while(result != (number1 + number2)){
			System.out.print("Wrong answer. Try agin. What is " + number1 + " + " + number2 + " = ? ");
			result = input.nextInt();
		}
		
		// Display the result
		System.out.println("You got it");
	}
}
