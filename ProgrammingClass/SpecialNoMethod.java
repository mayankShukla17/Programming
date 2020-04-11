/*
wajp to define a method to check the special two digit no or not 
*/

import java.util.Scanner;
	class SpecialNoMethod{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no.");
			int n = sc.nextInt();
			
			boolean rs=isSpecialNo(n);
			if(rs)
				System.out.println(n+" Special  No ");
			else
				System.out.println(n+" Not Special No ");
		}
		
		static boolean isSpecialNo(int n){
			int d1 = n/10;
			int d2 = n%10;
			int sum = (d1+d2)+(d1*d2);
			return sum == n;
		}
	}

