/*
Wajp to print the prime no between 1 to n
*/

import java.util.Scanner;
	class PrimeNoPrint{
		
		static boolean isPrime(int n){
			int i = 2;
			while(i<=n/2){
				if(n%i==0)
					return false;
				i++;
			}
			return true;
		}
		
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no");
			int n = sc.nextInt();
			for(int i=2;i<=n;i++){
				boolean pn=isPrime(i);
				if(pn==true)
					System.out.println(i);
			}
		}
	}