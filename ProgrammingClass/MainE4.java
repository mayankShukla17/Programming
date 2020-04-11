//Write a java program to check user entered no. is even or odd without using ifelse and ternary operator.
// Using Switch statement.

import java.util.Scanner;
	class MainE4{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int n = sc.nextInt();

			switch(n%2){
				case 0: System.out.println("Even Number.");
						break;
				case 1: System.out.println("Odd Number");
						break;
			}

		}
	}