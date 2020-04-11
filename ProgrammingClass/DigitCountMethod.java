/*
wajp to define a method to return no of digits in the passed no
*/

import java.util.Scanner;
	class DigitCountMethod{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no");
			int n = sc.nextInt();
			
			int c= digitCount(n);
			
			System.out.println(" No of digits " +c);			
		}
		
		static int digitCount(int x){
			int count=0;
			
			do{
				count++;
				x=x/10;
			}while(x!=0);
			return count;
		}
	}