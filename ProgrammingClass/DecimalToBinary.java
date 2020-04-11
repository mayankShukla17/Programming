/*
//Wajp to define a method to convert decimal no to binary no.
*/

import java.util.Scanner;

	class DecimalToBinary{
		static String decToBin(int dec){
			String bin="";
			do{
				int r=dec%2;
				bin=r+bin;
				dec=dec/2;
			}while(dec!=0);
			return bin;
		}

		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println(" Enter the no ");
			int n=sc.nextInt();
			String bin= decToBin(n);
			System.out.println(" Binary of " + n + " is " + bin );
		}
	}
