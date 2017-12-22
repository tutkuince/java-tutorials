package chapter05;

import java.util.Scanner;

public class SubtractionQuiz {

	/*
	 * generates five questions and, after a student answers all five, reports
	 * the number of correct answers. The program also displays the time spent
	 * on the test and lists all the questions.
	 */
	public static void main(String[] args) {
		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Number of question
		final int NUMBER_OF_QUESTION = 5;

		// Count the number of correct answer
		int correctAnswers = 0;

		// Count the number of questions
		int count = 0;

		// Start Time
		long startTime = System.currentTimeMillis();

		// Output
		String output = "";

		// Correct answer message
		String correctAnswerMessage = "You are correct ";

		// Wrong answer message
		String wrongAnswerMessage = "Your answer is wrong";

		while (count < NUMBER_OF_QUESTION) {

			// Generate two random single-digit integers
			int number1 = (int) (Math.random() * 10);
			int number2 = (int) (Math.random() * 10);

			// if number2 > number1, swap number1 with number2
			if (number2 > number1) {
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}

			// Prompt the user to enter subtraction result
			System.out.print(number1 + " - " + number2 + " = ? ");
			int result = input.nextInt();

			// Grade the answer
			if (result == (number1 - number2)) {
				System.out.println(correctAnswerMessage);
				correctAnswers++;
			} else {
				System.out.println(wrongAnswerMessage);
				System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
			}

			// Prepare output
			output += "\n" + number1 + " - " + number2 + " = " + result
					+ ((number1 - number2) == result ? " Correct" : " Wrong");

			// Increase the question count
			count++;
		}

		// End Time
		long endTime = System.currentTimeMillis();

		// Calculate test time
		long testTime = endTime - startTime;

		// Display the result
		System.out.println("\nCorrect count is " + correctAnswers);
		System.out.println("Wrong count is " + (NUMBER_OF_QUESTION - correctAnswers));
		System.out.println("Test time is " + testTime + " second");
		System.out.println(output);
	}
}
