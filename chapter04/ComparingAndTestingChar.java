package chapter04;

import java.util.Scanner;

public class ComparingAndTestingChar {

	public static void main(String[] args) {
		//Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter user's name
		System.out.print("Enter your name : ");
		
		//Take first char of name
		char ch = input.next().charAt(0);
		
		// Compare the first letter of user's name
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " is an uppercase letter.");
		}else if(ch >= 'a' && ch <= 'z'){
			System.out.println(ch + " is an lowercase letter.");
		}else if(ch >= '0' && ch <= '9'){
			System.out.println(ch + " is a numberic character");
		}
	}
}
