package chapter04.exercises;

import java.util.Scanner;

public class ComputeGreatCircleDistance {

	/*
	 * The great circle distance is the distance between two points on the
	 * surface of a sphere. Let (x1, y1) and (x2, y2) be the geographical
	 * latitude and longitude of two points. The great circle distance between
	 * the two points can be computed using the following formula: d = radius *
	 * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
	 */
	public static void main(String[] args) {
		// Create Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Prompt the user enter to point 1 latituted and longitude
		System.out.print("Enter point 1 (Latituded and Longitude) : ");
		double latidudeX1 = input.nextDouble();
		double longitudeY1 = input.nextDouble();

		// Prompt the user enter to point 2 latituted and longitude
		System.out.print("Enter point 2 (Latituded and Longitude) : ");
		double latidudeX2 = input.nextDouble();
		double longitudeY2 = input.nextDouble();

		// The average earth radious 6,371.01 km
		double averageEarthRadious = 6371.01;

		// Compute great circle distance between the two points
		double distance = averageEarthRadious * Math.toDegrees(Math.acos(Math.sin(latidudeX1) * Math.sin(latidudeX2)
				+ Math.cos(latidudeX1) * Math.cos(latidudeX2) * Math.cos(longitudeY1 - longitudeY2)));
		
		// Display the result
		System.out.println("The distance between the two points is " + distance);
	}
}
