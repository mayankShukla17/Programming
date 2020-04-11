/*
Wajp to calc the sum of digits in no.
*/

import java.util.Scanner;
	class DigitSum{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no");
			int n = sc.nextInt();
			
			int sum=0;
			do{
				int r=n%10;
				sum=sum+r;
				n=n/10;
			}while(n!=0);
			System.out.println(" Sum of digits " +sum);		
		}
	}