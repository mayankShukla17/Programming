//Write a java program to read the no from user and print it is neagative  or positive.

import java.util.Scanner;
	class PositiveNegative{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int n = sc.nextInt();
			
			if (n >=0) {
				System.out.println("No is positive.");
			}
			else {
				System.out.println("No is negative.");
			}
		}
	}