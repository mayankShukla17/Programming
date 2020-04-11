/*
Wajp to convert binary to decimal
*/

import java.util.Scanner;
	class BinaryToDecimal{
		public static void main(String[] args) {
			System.out.println(" Enter the binary no ");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int d=binToDec(n);
			System.out.println(d);
		}

		static int binToDec(int bin){
			int dec=0,c=0;
			do{
				int r=bin%10;
				dec=dec+r*(int)Math.pow(2,c);
				c++;
				bin=bin/10;
			}while(bin!=0);
			return dec;
		}
	}