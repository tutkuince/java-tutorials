package chapter03;

import java.util.Scanner;

public class SubtractionQuiz {

	public static void main(String[] args) {
		//Create Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//Generate random numbers
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		//SWAP ALGORITHM 
		if (number2 > number1) {
			//Temprature variable
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		//Prompt the student to answer question
		System.out.println("What is " + number1 + " - " + number2 + " = ?");
		int result = input.nextInt();
		
		//Check the answer and display result
		if (number1 - number2 == result) {
			System.out.println("You are correct!!!");
		}
		else {
			System.out.println("Your answer is wrong!!!");
			System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
		}
	}
}
