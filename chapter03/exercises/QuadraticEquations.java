package chapter03.exercises;

import java.util.Scanner;

public class QuadraticEquations {

	// Algebra: solve quadratic equations
	public static void main(String[] args) {
		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter values
		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		// Compute discrimant
		double discriminant = Math.pow(b, 2) - 4 * a * c;

		double r1 = (b * (-1) + Math.pow((b * b) - 4 * a * c, 0.5)) / 2 * a;
		double r2 = (b * (-1) - Math.pow((b * b) - 4 * a * c, 0.5)) / 2 * a;
		// The discriminant is positive
		if (discriminant > 0) {
			System.out.println("The equation has two roots " + r1 + " and " + r2);
		}
		// The discriminant is zero
		else if (discriminant == 0) {
			System.out.println("The equation has one root " + r1);
		}
		// The discriminant is negative
		else {
			System.out.println("The equation has no real roots.");
		}
	}
}
