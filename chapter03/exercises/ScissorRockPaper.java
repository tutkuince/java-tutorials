package chapter03.exercises;

import java.util.Scanner;

public class ScissorRockPaper {

	// Write a program that plays the popular scissor-rockpaper game.
	public static void main(String[] args) {
		// Create Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a number
		System.out.print("Scissor (0), Rock (1), Paper (2) :");
		int number = input.nextInt();

		// Generate random number
		int randomNumber = ((int) (Math.random() * 10) % 3);

		String computerGuess = null;
		String userGuess = null;

		String result = null;

		// Generate the values
		if (randomNumber == 0) {
			computerGuess = "Scissor";
			if (number == 0) {
				userGuess = "Scissor";
				result = "The computer is " + computerGuess + ". You are " + userGuess + ". It is a draw";
			} else if (number == 1) {
				userGuess = "Rock";
				result = "The computer is " + computerGuess + ". You are " + userGuess + ". You won";
			} else if (number == 2) {
				userGuess = "Paper";
				result = "The computer is " + computerGuess + ". You are " + userGuess + ". You lost";
			}
		} else if (randomNumber == 1) {
			computerGuess = "Rock";
			if (number == 0) {
				userGuess = "Scissor";
				result = "The computer is " + computerGuess + ". You are " + userGuess + ". You won";
			} else if (number == 1) {
				userGuess = "Rock";
				result = "The computer is " + computerGuess + ". You are " + userGuess + ". It is a draw";
			} else if (number == 2) {
				userGuess = "Paper";
				result = "The computer is " + computerGuess + ". You are " + userGuess + ". You lost";
			}
		} else if (randomNumber == 2) {
			computerGuess = "Paper";
			if (number == 0) {
				userGuess = "Scissor";
				result = "The computer is " + computerGuess + ". You are " + userGuess + ". You won";
			} else if (number == 1) {
				userGuess = "Rock";
				result = "The computer is " + computerGuess + ". You are " + userGuess + ". You lost";
			} else if (number == 2) {
				userGuess = "Paper";
				result = "The computer is " + computerGuess + ". You are " + userGuess + ". It is a draw";
			}
		}
		//Display the result
		System.out.println(result);
	}
}
