/*
Wajp to first n fibonocci no
*/

import java.util.Scanner;
	class Fibonocci{
		static void printFib(int n){
			int f1=0,f2=1,f3;
			while (n>0){
				System.out.println(f1+" ");
				f3=f1+f2;
				f1=f2;
				f2=f3;
				n--;
			}
		}

		public static void main(String[] args) {
			// printFib(5);
			Scanner sc = new Scanner(System.in);
			System.out.println(" Enter the no ");
			int n=sc.nextInt();
			printFib(n);
		}
	}