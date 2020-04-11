/*
Wajp to define a method to return n^p
*/

import java.util.Scanner;
	class Power{
		
		static int pow(int n, int p){
			int pw=1;
			while(p>0){
				pw=pw*n;
				p--;
			}
			return pw;
		}
		public static void main(String[] args){
			int pw = pow(5,3);
			System.out.println(pw);//125
		}
	}