/*
Wajp to check user entered no is digit or number
*/

import java.util.Scanner;
	class DigitNo{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value");
			int n = sc.nextInt();
			
			
			if(n>-10&&n<10)
				System.out.println("Digit");
			else
				System.out.println("Number");
		}
	}