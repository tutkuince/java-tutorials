package chapter02;

import java.util.Scanner;

public class SalexTax {

	/*
	 * Displays the sales tax with two digits after the decimal point.
	 * 
	 * */
	public static void main(String[] args) {
		
		//Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for input
		System.out.print("Enter purchase amount : ");
		double purchaseAmount = input.nextDouble();
		
		double tax = purchaseAmount * 0.18;
		System.out.println("Sales tax is : " + (int)(tax * 100) / 100.0);
	}
}
