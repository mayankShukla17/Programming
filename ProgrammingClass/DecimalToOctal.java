/*
Wajp to define a method to convert decimal no to octal no
*/

import java.util.Scanner;

	class DecimalToOctal{
		static String decToOct(int dec){
			String oct="";
			do{
				int r=dec%8;
				oct=r+oct;
				dec=dec/8;
			}while(dec!=0);
			return oct;
		}

		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println(" Enter the no ");
			int n=sc.nextInt();
			String oct= decToOct(n);
			System.out.println(" Octal of " + n + " is " + oct );
		}
	}
