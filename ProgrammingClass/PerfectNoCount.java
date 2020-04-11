/*
Wajp  to count how many perfect no within 100
*/

import java.util.Scanner;
	class PerfectNoCount
	{				
		static boolean isPerfect(int n) 
		{
			int sum=0,i=1;
				while(i<=n/2){
					if(n%i==0){
						sum=sum+i;
					}
					i++;
			}
			if(sum==n)
				return true;
			else
				return false;
		}
			
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no");
			int n = sc.nextInt();
			int count=0;
			for(int i=2;i<=n;i++){
				boolean pn=isPerfect(i);
				if(pn==true){
					count++;
					System.out.println(i);
				}
			}
			System.out.println(count);
		}
	}