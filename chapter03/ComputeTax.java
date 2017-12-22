package chapter03;

import java.util.Scanner;

public class ComputeTax {

	/*
	 * You are to write a program to compute personal income tax. Your program
	 * should prompt the user to enter the filing status and taxable income and
	 * compute the tax. Enter "0" for single filers, "1" for married filing
	 * jointly or qualified widow(er), "2" for married filing separately, and
	 * "3" for head of household. Your program computes the tax for the taxable
	 * income based on the filing status.
	 * 
	 * For each filing status there are six tax rates. Each rate is applied to a certain amount of
		taxable income. For example, of a taxable income of $400,000 for single filers, $8,350 is
		taxed at 
		(8,350 – 0) at 10%, 
		(33,950 – 8,350) at 15%, 
		(82,250 – 33,950) at 25%, 
		(171,550 – 82,250) at 28%,
		(372,950 – 171,550) at 33%, and 
		(400,000 – 372,950) at 35%.
	 */
	public static void main(String[] args) {
		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//Promt the user to enter filing status
		System.out.print("(0-single filer, 1-married jointly or " + 
		"qualifying widow(er), 2-married separately, 3-head of " + 
				"household) Enter the filing status: ");
		int filingStatus = input.nextInt();
		
		
		//Prompt the user to enter taxable income
		System.out.print("Enter taxable income : ");
		double income = input.nextDouble();
		
		//Compute tax
		double tax = 0;
		
		if (filingStatus == 0) {
			//Compute tax for single filers
			if (income <= 8350) {
				tax = income * 8350;
			} else if (income <= 33950) {
				tax = 8350 * 0.10 + (income - 8350) * 0.15;
			} else if (income <= 82250) {
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
			} else if (income <= 171550) {
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
			} else if (income <= 372950) {
				tax = 8350 * 0.10 + (33950 - 8351) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
						+ (income - 171550) * 0.33;
			} else if (income > 372950) {
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
						+ (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
			}
		} else if (filingStatus == 1) {
			//Compute tax for married filers
			if (income <= 16700) {
				tax = income * 0.10;
			} else if (income <= 67900) {
				tax = 16700 * 0.10 + (income - 16700) * 0.15;
			} else if (income <= 137050) {
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;
			} else if (income <= 208850) {
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (income - 137050) * 0.28;
			} else if (income <= 372950) {
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28
						+ (income - 208850) * 0.33;
			} else if (income > 372950) {
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28
						+ (372950 - 208850) * 0.33 + (income - 372950) * 0.35;
			}
		} else if (filingStatus == 2) {
			//Compute tax for married filing separately
			if (income <= 8350) {
				tax = income * 0.10;
			} else if (income <= 33950) {
				tax = 8350 * 0.10 + (income - 8350) * 0.15;
			} else if (income <= 68525) {
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
			} else if (income <= 104425) {
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33951) * 0.25 + (income - 68525) * 0.28;
			} else if (income <= 186475) {
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28
						+ (income - 104426) * 0.33;
			} else if (income > 186475) {
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28
						+ (186475 - 104426) * 0.33 + (income - 186476) * 0.35;
			}
		} else if (filingStatus == 3) {
			//Compute tax for head of household
			if (income <= 11950) {
				tax = income * 0.10;
			} else if (income <= 45500) {
				tax = 11950 * 0.10 + (income - 11950) * 0.15;
			} else if (income <= 117450) {
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (income - 45500) * 0.25;
			} else if (income <= 190200) {
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (income - 11740) * 0.28;
			} else if (income <= 372950) {
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 11740) * 0.28
						+ (income - 190200) * 0.33;
			} else if (income > 372950) {
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 11740) * 0.28
						+ (372950 - 190200) * 0.33 + (income - 372950) * 0.35;
			}
		} else {
			//Display wrong status
			System.out.println("Invalid status!!!");
		}
		
		//Display the result
		System.out.println("Tax is " + (int)(tax * 100) / 100.0);
	}
}
