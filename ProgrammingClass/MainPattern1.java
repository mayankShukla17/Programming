/*
Wajp to print  the pattern
n=5		* * * * *	n=3 * * *
		* * * * *		* * *
		* * * * *		* * *
		* * * * *
		* * * * *

*/


import java.util.Scanner;
	class MainPattern1{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println(" Enter the no ");
			int n = sc.nextInt();
			for (int i=1;i<=n;i++) //No of lines
			{
				for (int j=1;j<=n;j++) //No of stars in each line
				{
				System.out.print("* ");
				}
			System.out.println();
			}
		}
	}