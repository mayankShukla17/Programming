/*
Wajp to read month no from the user and print how many days in that month if 2 print 28,29
*/

import java.util.Scanner;
	class MonthDays{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the month no");
			int m = sc.nextInt();
			
			if(1<=m && m<=12 && m==1)
				System.out.println("31");
			else if(1<=m && m<=12 && m==2)
				System.out.println("28 or 29");
			else if(1<=m && m<=12 && m==3)
				System.out.println("31");
			else if(1<=m && m<=12 && m==4)
				System.out.println("30");
			else if(1<=m && m<=12 && m==5)
				System.out.println("31");
			else if(1<=m && m<=12 && m==6)
				System.out.println("30");
			else if(1<=m && m<=12 && m==7)
				System.out.println("31");
			else if(1<=m && m<=12 && m==8)
				System.out.println("31");
			else if(1<=m && m<=12 && m==9)
				System.out.println("30");
			else if(1<=m && m<=12 && m==10)
				System.out.println("31");
			else if(1<=m && m<=12 && m==11)
				System.out.println("30");
			else if(1<=m && m<=12 && m==12)
				System.out.println("31");
			else
				System.out.println("Invalid month no");
		}
	}