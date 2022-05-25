package assignments;

import java.util.Random;
import java.util.Scanner;

public class Tank_Level {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		Random rn = new Random();
		int Water_level = rn.nextInt(101);
		System.out.println("Initial level of tank is: " + Water_level);
		int Initial_Level = Water_level;
		String User_Input = "null";

		do {
			System.out.println("\nHey user please type in Yes if you would like to start filling tank");
			User_Input = scn.nextLine();
			if (!User_Input.equals("Yes")) {
				System.out.println("You have not enetered 'Yes'");
			}
		} while (!User_Input.equals("Yes"));

		if (User_Input.equals("Yes")) {

			System.out.println("\n" + "You have entered 'Yes' tank has started filling");

			int count = 0;
			while (Water_level < 100) {

				Water_level = Water_level + 10;
				count = count + 1;
				if (Water_level >= 100) {

					Water_level = 100;
					break;

				}

			}
			System.out.println("Tank is full now level is at " + Water_level);
			System.out.println("Total buckets used were: " + count);
			System.out.println("The water left in the last bucket was: " + (count * 10 + Initial_Level - 100));

		} else {

			System.out.println("You have not entered 'Yes' please try again");
		}

		scn.close();

	}

}
