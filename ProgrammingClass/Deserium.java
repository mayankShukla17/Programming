/*
Wajp to check ur no is deserium no or not
Deserium no=sum of power of palce of that digit
=>135=1^1+3^2+5^3=1+9+125=135
*/

import java.util.Scanner;
	class Deserium{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no");
			int n = sc.nextInt();
			boolean rs=isDeserium(n);
			if(rs)
				System.out.println(n+" is Deserium  No ");
			else
				System.out.println(n+" is not a Deserium No ");
		}
		
		static boolean isDeserium(int n){
			int sum=0,t=n;
			int dc=countDigits(n);
			do{
				int r = n%10;
				sum=sum+pow(r,dc);
				dc--;
				n=n/10;
			}while(n!=0);
			return sum==t;
		}
		
		static int countDigits(int x){
			int count =0;
			do{
				count++;
				x=x/10;
			}while(x!=0);
			return count;
		}
		
		static int pow(int x,int p){
			int pw=1;
			while(p>0){
				pw=pw*x;
				p--;
			}
			return pw;
		}
	}