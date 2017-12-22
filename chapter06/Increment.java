package chapter06;

public class Increment {

	/** Main method */
	public static void main(String[] args) {
		int x = 1;
		System.out.println("Before the call, x is " + x);
		
		// Invoke increment method
		increment(x);
		
		
		System.out.println("After the call, x is " + x);
	}

	/** Increment method */
	private static void increment(int n) {
		n++;
		System.out.println("n inside the method is " + n);
	}
}
