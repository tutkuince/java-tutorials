package chapter07.exercises;

import java.util.Scanner;

public class SortStudents {
	/*
	 * (Sort students) Write a program that prompts the user to enter the number
	 * of students, the students’ names, and their scores, and prints student
	 * names in decreasing order of their scores.
	 */

	/** Main method */
	public static void main(String[] args) {
		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the number of students
		System.out.print("Enter the number of studens : ");
		int numberOfStudents = input.nextInt();

		String[] studentNames = new String[numberOfStudents];
		int[] studentScores = new int[numberOfStudents];

		for (int i = 0; i < numberOfStudents; i++) {
			System.out.print("Enter student name : ");
			String name = input.next();
			studentNames[i] = name;

			System.out.print("Enter student score : ");
			int score = input.nextInt();
			studentScores[i] = score;
		}

		// Invoke decreasingScores method
		decreasingScores(studentScores, studentNames);
	}

	/**
	 * Prints student names in decreasing order of their scores.
	 */
	public static void decreasingScores(int[] studentScores, String[] studentNames) {
		for (int i = 0; i < studentScores.length; i++) {
			// Find the minimum score
			int currentMinScore = studentScores[i];
			int currentMinScoreIndex = i;

			for (int j = i + 1; j < studentScores.length; j++) {
				if (currentMinScore > studentScores[j]) {
					currentMinScore = studentScores[j];
					currentMinScoreIndex = j;
				}
			}

			// Swap, if necessary
			if (currentMinScoreIndex != i) {
				studentScores[currentMinScoreIndex] = studentScores[i];
				studentScores[i] = currentMinScore;

				String temp = studentNames[currentMinScoreIndex];
				studentNames[currentMinScoreIndex] = studentNames[i];
				studentNames[i] = temp;

			}
		}

		// Display the result
		for (int i = studentScores.length - 1; 0 <= i; i--) {
			System.out.println(studentNames[i] + " : " + studentScores[i]);
		}
	}
}
