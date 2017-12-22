package chapter06;

public class PassingArgumentByValues {

	/** Main method */
	public static void main(String[] args) {

		// Invoke nPrintln method
		nPrintln("Hello Java", 3);
	}

	/** Write message n times */
	public static void nPrintln(String message, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(message);
		}
	}
}
