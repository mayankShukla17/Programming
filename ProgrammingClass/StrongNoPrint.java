/*
Wajp to print the strong no within 1000(for loop)
*/

import java.util.Scanner;
	class StrongNoPrint{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no");
			int n = sc.nextInt();
			
			int count=0;
			for(int i=1;i<=n;i++){
				boolean strongNo=isStrong(i);
				if(strongNo==true){
					count++;
					System.out.println(i);
				}
			}
			System.out.println(count);
		}
		
		static boolean isStrong(int n){
			int sum=0,t=n;
			do{
				int r = n%10;
				sum=sum+fact(r);
				n=n/10;
			}while(n!=0);
			return sum==t;
		}
		
		static int fact(int x){
			int f=1;
			while(x>1){
				f=f*x;
				x--;
			}
			return f;
		}
	}