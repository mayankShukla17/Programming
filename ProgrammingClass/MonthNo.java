/*
Wajp to read the month no from the user and print the corresponding month using elseif.
*/

import java.util.Scanner;
	class MonthNo{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the month no");
			int m = sc.nextInt();
			
			if(1<=m && m<=12 && m==1)
				System.out.println("January");
			else if(1<=m && m<=12 && m==2)
				System.out.println("February");
			else if(1<=m && m<=12 && m==3)
				System.out.println("March");
			else if(1<=m && m<=12 && m==4)
				System.out.println("April");
			else if(1<=m && m<=12 && m==5)
				System.out.println("May");
			else if(1<=m && m<=12 && m==6)
				System.out.println("June");
			else if(1<=m && m<=12 && m==7)
				System.out.println("July");
			else if(1<=m && m<=12 && m==8)
				System.out.println("August");
			else if(1<=m && m<=12 && m==9)
				System.out.println("September");
			else if(1<=m && m<=12 && m==10)
				System.out.println("October");
			else if(1<=m && m<=12 && m==11)
				System.out.println("November");
			else if(1<=m && m<=12 && m==12)
				System.out.println("December");
			else
				System.out.println("Invalid month no");
		}
	}