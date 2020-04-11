/*
Wajp to calc sum of square of individual digits 
*/

import java.util.Scanner;
	class SquareOfDigits{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no");
			int n = sc.nextInt();
			
			int squareSum=0;
			do{
				int r=n%10;
				squareSum=squareSum+r*r;
				n=n/10;
			}while(n!=0);
			System.out.println(" Sum of square of digits " +squareSum);		
		}	
	}