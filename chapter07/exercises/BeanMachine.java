package chapter07.exercises;

import java.util.Scanner;

/*
 * Write a program that simulates the bean machine. Your program should
 * prompt the user to enter the number of the balls and the number of the
 * slots in the machine. Simulate the falling of each ball by printing its
 * path
 */
public class BeanMachine {
	/** Main method */
	public static void main(String[] args) {
		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter number of balls to drop
		System.out.print("Enter number of balls to drop : ");
		int numberOfBalls = input.nextInt();

		// Prompt the user
		System.out.print("Enter the number of slots in the bean machine : ");
		int numberOfSlots = input.nextInt();

		// Invoke printPath method
		printPath(numberOfBalls, numberOfSlots);

	}

	/** Print number of balls path */
	private static void printPath(int numberOfBalls, int numberOfSlots) {
		char[][] slots = new char[numberOfBalls][numberOfSlots];

		for (int i = 0; i < numberOfBalls; i++) {
			for (int j = 0; j < numberOfSlots; j++) {
				slots[i][j] = ' ';
			}
		}

		int position = 0;

		char c = ' ';
		// Generate slots with random
		for (int i = 0; i < numberOfBalls; i++) {
			for (int j = 1; j < numberOfSlots; j++) {
				int rnd = (int) (Math.random() * 10);
				if (rnd % 2 == 0) {
					c = 'L';
				} else {
					c = 'R';
					position++;
				}
				System.out.print(c);
			}
			slots[i][position] = '0';
			System.out.println();
			position = 0;
		}
		System.out.println();
		printSlots(slots, numberOfBalls, numberOfSlots);
	}

	/** Print number of balls in slot */
	public static void printSlots(char[][] slots, int numberOfBalls, int numberOfSlots) {
		for (int i = numberOfBalls - 1; 0 <= i; i--) {
			for (int j = numberOfSlots - 1; 0 <= j; j--) {
				System.out.print(slots[i][j]);
			}
			System.out.println();
		}
	}
}
