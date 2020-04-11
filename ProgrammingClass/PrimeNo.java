/*
Wajp to define a method to return prime
*/

import java.util.Scanner;
	class PrimeNo{
		static boolean isPrime(int x){
			int i = 2;
			while(i<=x/2){
				if(x%i==0){
					return false;
				}
				i++;
			}
			return true;
		}
		
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no");
			int n = sc.nextInt();
			boolean rs=isPrime(n);
			if(rs)
				System.out.println(n+" is Prime No ");
			else
				System.out.println(n+" is not a Prime No ");
		}
	}