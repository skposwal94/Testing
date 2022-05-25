package assignments;

import java.util.Scanner;

public class Prime_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		boolean t = false;
		int input = 0;

		// accepting positive integer from user without throwing exception

		do {
			System.out.println("Input a positive Integer");
			String user_input = scn.nextLine();
			try {
				input = Integer.parseInt(user_input);
				if (input > 0) {
					t = true;
				}

			} catch (NumberFormatException nfe) {
				System.out.println("\nValue enetered is not an Integer");
			}
		} while (t == false);

		System.out.println("\nNumber you have entered is: " + input + "\n\nRunning Prime Check");

		// Checking of Prime or not

		for (int i = 2; i < input; i++) {
			if (input % i == 0) {
				System.out.println("No. is non-Prime");
				break;
			} else if (input % i != 0) {

				System.out.println("No. is Prime");
				break;
			}

		}

		scn.close();

	}

}
