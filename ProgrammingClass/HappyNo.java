/*
Wajp to define a method to check the no is happy no or not 
19=1^2+9^2=82=8^2+2^2=68=6^2+8^2=100=1^2+0^2+0^2=1 || 7(Happy no)


*/

import java.util.Scanner;
	class HappyNo{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no.");
			int n = sc.nextInt();
			
			boolean rs=isHappyNo(n);
			if(rs)
				System.out.println(n+" Happy  No ");
			else
				System.out.println(n+" Not Happy No ");
		}
		
		static boolean isHappyNo(int n){
			while(n>9){
				int sum=0;
				do{
					int r=n%10;
					sum=sum+r*r;
					n=n/10;
				}while(n!=0);
				n=sum;
			}
			return n==1 || n == 7;
		}
	}
	