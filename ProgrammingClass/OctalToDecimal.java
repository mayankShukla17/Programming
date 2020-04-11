/*
Wajp to convert octal to decimal
*/

import java.util.Scanner;
	class OctalToDecimal{
		public static void main(String[] args) {
			System.out.println(" Enter the octal no ");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int o=binToOct(n);
			System.out.println(o);
		}

		static int binToOct(int oct){
			int dec=0,c=0;
			do{
				int r=oct%10;
				dec=dec+r*(int)Math.pow(8,c);
				c++;
				oct=oct/10;
			}while(oct!=0);
			return dec;
		}
	}