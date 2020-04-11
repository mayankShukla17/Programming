/*
Wajp to count how many prime no within n
*/

import java.util.Scanner;
	class PrimeNoCount{
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
			Scanner sc=new Scanner(System.in);
			System.out.println(" Enter the no ");
			int n=sc.nextInt();
			int count=0;
			for(int i=2;i<=n;i++){
				boolean pn=isPrime(i);
				if(pn==true){
					count++;
					System.out.println(i);
				}
			}
			System.out.println(" No of prime no are "+count);
		}
	}