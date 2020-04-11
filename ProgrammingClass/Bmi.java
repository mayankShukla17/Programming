//Wajp to read the height and weight (kg , meters) of a person  based on that calc bmi.

import java.util.Scanner;
	class Bmi{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the height in meters.");
			float ht = sc.nextFloat();
			System.out.println("Enter the weight in KG.");
			float wt = sc.nextFloat();
			
			Float bmi = wt/(ht*ht);
			System.out.println("BMI is " + bmi);

		}
	}
