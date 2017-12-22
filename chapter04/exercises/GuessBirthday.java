package chapter04.exercises;

import java.util.Scanner;

public class GuessBirthday {

	/*
	 * prompt the user to enter the character Y for Yes and N for No
	 */
	public static void main(String[] args) {
		// Create Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// ----1 0
		String set1 = " 1  3  5  7\n 9 11 13 15\n 17 19 21 23\n 25 27 29 31";

		// ---1- 2
		String set2 = " 2  3  6  7\n 10 11 14 15\n 18 19 22 23\n 26 27 30 31";

		// --1-- 4
		String set3 = " 4  5  6  7\n 12 13 14 15\n 20 21 22 23\n 28 29 30 31";

		// -1--- 8
		String set4 = " 8  9 10 11\n 12 13 14 15\n 24 25 26 27\n 28 29 30 31";

		// 1---- 16
		String set5 = "16 17 18 19\n 20 21 22 23\n 24 25 26 27\n 28 29 30 31";

		// Generate bithday default value
		int day = 0;

		// Prompt the user to answer questions
		System.out.print("Is your birthday in Set1?\n");
		System.out.print(set1);
		System.out.print("\nEnter \"N\" for No and \"Y\" for Yes: ");
		char answer = input.next().charAt(0);

		if (Character.toUpperCase(answer) == 'Y') {
			day += 1;
		}

		// Prompt the user to answer questions
		System.out.print("Is your birthday in Set1?\n");
		System.out.print(set2);
		System.out.print("\nEnter \"N\" for No and \"Y\" for Yes: ");
		answer = input.next().charAt(0);

		if (Character.toUpperCase(answer) == 'Y') {
			day += 2;
		}

		// Prompt the user to answer questions
		System.out.print("Is your birthday in Set1?\n");
		System.out.print(set3);
		System.out.print("\nEnter \"N\" for No and \"Y\" for Yes: ");
		answer = input.next().charAt(0);

		if (Character.toUpperCase(answer) == 'Y') {
			day += 4;
		}

		// Prompt the user to answer questions
		System.out.print("Is your birthday in Set1?\n");
		System.out.print(set4);
		System.out.print("\nEnter \"N\" for No and \"Y\" for Yes: ");
		answer = input.next().charAt(0);

		if (Character.toUpperCase(answer) == 'Y') {
			day += 8;
		}

		// Prompt the user to answer questions
		System.out.print("Is your birthday in Set1?\n");
		System.out.print(set5);
		System.out.print("\nEnter \"N\" for No and \"Y\" for Yes: ");
		answer = input.next().charAt(0);

		if (Character.toUpperCase(answer) == 'Y') {
			day += 16;
		}

		// Display the result
		System.out.println("\nYour birthday is " + day + "!");
	}
}
