package chapter03.exercises;

import java.util.Scanner;

public class SubtractionQuiz {

	/*
	 * Listing 3.3, SubtractionQuiz.java, randomly generates a subtraction
	 * question. Revise the program to randomly generate an addition question
	 * with two integers less than 100.
	 */
	public static void main(String[] args) {
		//Create Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//Generate 2 values for subtraction
		int number1 = (int)(Math.random() * 100);
		int number2 = (int)(Math.random() * 100);
		
		//Swap algorithm
		if (number2 > number1) {
			int temp = number2;
			number2 = number1;
			number1 = temp;
		}
		
		//Prompt the user to enter subtraction result
		System.out.print(number1 + " - " + number2 + " = ? ");
		int result = input.nextInt();
		
		//Check and display the result
		if (result == (number1 - number2)) {
			System.out.println("Your answer is true");
		}else{
			System.out.println("Your answer is false. The result is " + (number1 - number2));
		}
	}
}
