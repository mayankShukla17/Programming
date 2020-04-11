/*
wajp to define a method to return sum of digits
*/

import java.util.Scanner;
	class DigitSumMethod{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no");
			int n = sc.nextInt();
			
			DigitSumMethod dsm = new DigitSumMethod();
			int s=dsm.digitSum(n);
			
			System.out.println(" Sum of digits " +s);		
		}
		
		int digitSum(int x){
			int sum=0;
			do{
				int r=x%10;
				sum=sum+r;
				x=x/10;
			}while(x!=0);
			return sum;
		}
	}