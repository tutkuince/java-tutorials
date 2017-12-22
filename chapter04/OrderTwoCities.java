package chapter04;

import java.util.Scanner;

public class OrderTwoCities {
	public static void main(String[] args) {
		//Create scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter the first city
		System.out.print("Enter the first city : ");
		String firstCity = input.nextLine();
		
		//Prompt user to enter the second city
		System.out.print("Enter the second city : ");
		String secondCity = input.nextLine();
		
		//Compare the cities
		if (firstCity.compareTo(secondCity) > 0) {
			System.out.println("The cities in alphabetical order are " + firstCity + " " + secondCity);
		}else {
			System.out.println("The cities in alphabetical order are " + secondCity + " " + firstCity);
		}
		input.close();
	}
}
