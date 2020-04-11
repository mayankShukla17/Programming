/*
wajp to define a method to return biggest among 3 no
*/

import java.util.Scanner;
	class Biggest3Method{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no.");
			int a,b,c,big;
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			
			big = isBiggest(a,b,c);
			System.out.println(" Biggest "  + big);
		}
		
		static int isBiggest(int x,int y, int z){
			int b;
			if(x>y&&x>z)
				return b= x;
			else if (y>z)
				return b = y;
			else
				return b = z;
		}
	}