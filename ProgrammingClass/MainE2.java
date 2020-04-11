//Write a java program to check user entered no. is even or odd without using modulus operator.

import java.util.Scanner;
	class MainE2{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int n = sc.nextInt();
			if (n/2*2==n) {
				System.out.println(n + " is Even number. " );
			}
			else{
				System.out.println(n + " is Odd number. " );
			}
		}
	}