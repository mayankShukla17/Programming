/*
Wajp to calc the products of the digits 
*/

import java.util.Scanner;
	class DigitProduct{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no");
			int n = sc.nextInt();
			
			int product=1;
			do{
				int r=n%10;
				product=product*r;
				n=n/10;
			}while(n!=0);
			System.out.println(" Product of digits " +product);		
		}
	}