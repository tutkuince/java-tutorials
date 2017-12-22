package chapter06.exercises;

import java.util.Scanner;

public class CheckPassword {

	/*
	 * Some websites impose certain rules for passwords. Write a method that
	 * checks whether a string is a valid password. Suppose the password rules
	 * are as follows:
	 * 
	 * A password must have at least eight characters.
	 * A password consists of only letters and digits.
	 * A password must contain at least two digits.
	 * 
	 * Write a program that prompts the user to enter a password and displays
	 * Valid Password if the rules are followed or Invalid Password otherwise.
	 */
	
	/** Main method */
	public static void main(String[] args) {
		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a password
		System.out.print("Enter your password : ");
		String password = input.nextLine();
		
		// Display result
		if(isValid(password)){
			System.out.println(password + " is valid.");
		}else{
			System.out.println(password + " is invalid.");
		}
	}
	
	/** Check password is valid or invalid */
	public static boolean isValid(String password){
		int digitCount = 0;
		
		boolean isValid = true;
		
		if(password.length() >= 8){
			for (int i = 0; i < password.length(); i++) {
				if(Character.isDigit(password.charAt(i)) || Character.isLetter(password.charAt(i))){
					if(Character.isDigit(password.charAt(i))){
						digitCount++;
					}
				}else{
					isValid = false;
					break;
				}
			}
		}else{
			isValid = false;
		}
		if(digitCount < 2){
			isValid = false;
		}
		
		return isValid;
	}
}
