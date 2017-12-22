package chapter03;

import java.util.Scanner;

public class AdditionQuiz {

	public static void main(String[] args) {
		// Create Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Math always return 0>=number1 and 1<number1

		// Generate random number to number1
		int number1 = (int) (Math.random() * 10);

		// Generate random number to number2
		int number2 = (int) (Math.random() * 10);
		
		//Prompt user for input(answer)
		System.out.println("What is the result for " + number1 + " + " + number2 + " = ?");
		int result = input.nextInt();
		
		//Display result
		if (result == (number1 + number2)) {
			System.out.println("The result is true!");
		}else{
			System.out.println("The result is false!!!");
		}
	}
}
