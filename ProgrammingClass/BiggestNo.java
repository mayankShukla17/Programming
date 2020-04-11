//Write a java program to read two integer no from user and print biggest among those two no by using ternary operator.

import java.util.Scanner;
	class BiggestNo{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first number");
			int n1 = sc.nextInt();
			System.out.println("Enter the second number");
			int n2 = sc.nextInt();
			
			int n = (n1>n2)?n1:n2;
			System.out.println("Biggest no is " + n );
		}
	}