/*
Wajp to define a method to print n prime no  
*/

import java.util.Scanner;
	class PrintPrimes{
		static boolean isPrime(int n){
			int i = 2;
			while(i<=n/2){
				if(n%i==0)
					return false;
				i++;
			}
			return true;
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println(" Enter the no of terms to print. ");
			int n = sc.nextInt();
			for (int i=2;n>0;i++) {
				boolean rs=isPrime(i);
				if (rs) {
					System.out.println(i);
					n--;
				}
			}
		}
	}