package chapter03;

import java.util.Scanner;

public class ComputeScore {

	public static void main(String[] args) {
		// Create Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Prompt user for input (Score)
		System.out.print("Enter your score for your grade : ");
		int score = input.nextInt();

		//Check the score
		
		/*Multiple if
		if (score >= 90) {
			System.out.println("A");
		} else {
			if (score >= 80) {
				System.out.println("B");
			} else {
				if (score >= 70) {
					System.out.println("C");
				} else {
					if (score >= 60) {
						System.out.println("D");
					} else {
						System.out.println("F");
					}
				}
			}
		}
		*/
		//Multi-way
		if (score >= 90) {
			System.out.println("A");
		}
		else if (score >= 80) {
			System.out.println("B");
		}
		else if (score >= 70) {
			System.out.println("C");
		}
		else if (score >= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}
}
