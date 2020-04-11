/*
Wajp to define a method to convert decimal no to hexadecimal no
*/

import java.util.Scanner;

	class DecimalToHexaDecimal{
		static String decToHex(int dec){
			String hx="";
			do{
				int r=dec%16;
				if (r<10) 
					hx=r+hx;
				else if (r==10) 
					hx='A'+hx;
				else if (r==11) 
					hx='B'+hx;
				else if (r==12) 
					hx='C'+hx;
				else if (r==13) 
					hx='D'+hx;
				else if (r==14) 
					hx='E'+hx;
				else if (r==15)
					hx='F'+hx;
				dec=dec/16;		
			}while(dec!=0);
			return hx;
		}

		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println(" Enter the no ");
			int n=sc.nextInt();
			String hex= decToHex(n);
			System.out.println(" Hexadecimal of " + n + " is " + hex );
		}
	}