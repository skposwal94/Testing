package assignments;

import java.util.Random;
import java.util.Scanner;

public class Thermostat_temp {

	public static void main(String[] args) {

		Random rnd = new Random();
		int current_temp = rnd.nextInt(35);

		Scanner scn = new Scanner(System.in);

		System.out.println("Current room temprartue is: " + current_temp);

		boolean t = false;
		int temp = current_temp;

		do {
			System.out.println("\nEnter the temprature you would like to set (0-34)");
			String temp_req = scn.nextLine();
			try {
				temp = Integer.parseInt(temp_req);
				if (temp > 0 && temp < 35) {
					t = true;

				} else {
					System.out.println("Tempratue not in range");
				}

			} catch (Exception e) {

				System.out.println("Tempratue enetered is not in Integer format");

			}

		} while (t == false);

		System.out.println("\nTemp set at: " + temp);

		scn.close();

	}
}
