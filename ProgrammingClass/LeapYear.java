/*
Wajp to check user entered year is leap year or not.
*/

import java.util.Scanner;

	class LeapYear{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the year.");
			int year=sc.nextInt();
			
			/*if(year%400==0)
				System.out.println("Year is a Leap Year");
			else if (year%4==0 && year%100!=0)
				System.out.println("Year is a Leap Year");
			else
				System.out.println("Year is not a Leap Year");*/
			
			if(year>999 && year<10000 && year%400==0 || (year%4==0 && year%100!=0))
				System.out.println("Year is a Leap Year");
			else 
				System.out.println("Year is not a Leap Year");
		}
	}
