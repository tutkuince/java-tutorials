package chapter06;

import java.util.Scanner;

public class Hex2Dec {

	/** Main method */
	public static void main(String[] args) {
		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a string 
		System.out.print("Enter a hax number : ");
		String hex = input.nextLine();
		
		// Display the result
		System.out.println("Decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
	}
	/** Convert to hex to decimal */
	public static int hexToDecimal(String hex){
		int decimalValue = 0;
		for (int i = 0; i < hex.length(); i++) {
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
		return decimalValue;
	}
	
	/** Convert to hex char to decimal */
	public static int hexCharToDecimal(char ch){
		if('A' <= ch && ch <= 'F'){
			return 10 + ch - 'A';
		}else{
			return ch - '0';
		}
	}
}
