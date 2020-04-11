/*
Wajp to define a method to check the no is armstrong or not

armstrong= sum of power of digits by no of its digits == to the no

9=9^1=9
28=2^2+8^2=68X
153=1^3+5^3+3^3
*/

import java.util.Scanner;
	class ArmStrong{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no");
			int n = sc.nextInt();
			boolean rs=isArmStrong(n);
			if(rs)
				System.out.println(n+" is Arm Strong  No ");
			else
				System.out.println(n+" is not a Arm Strong No ");
		}
		
		static boolean isArmStrong(int n){
			int sum=0,t=n;
			int dc=countDigits(n);
			do{
				int r = n%10;
				sum=sum+pow(r,dc);
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