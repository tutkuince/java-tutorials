package chapter05;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// Create Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Generate a random number(0-99) to be guessed
		int number = (int) (Math.random() * 100);

		// Prompt the user to guess the number
		System.out.print("Guess a magic number betwee 0 and 100 : ");
		int guess = input.nextInt();

		// Input validation
		while (guess != number) {
			if(guess > number){
				System.out.print("Your guess is higher than number. Try again : ");
				guess = input.nextInt();
			}else {
				System.out.print("Your guess is lower than number. Try again : ");
				guess = input.nextInt();
			}
		}
		
		// Display the result 
		System.out.println("Yes, the number is " + number);
	}
}
