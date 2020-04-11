/*
Wajp to define a method to check user entered no is perfect no or not.

6-(Divisors)=1,2,3
perfect no = 6 ==1+2+3+=6
*/

import java.util.Scanner;
	class PerfectNo 
	{				
		boolean isPerfect(int n) //Called Method
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
			
		public static void main(String[] args) //Calling method
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no");
			int no = sc.nextInt();
			PerfectNo pf = new PerfectNo();
			boolean rs = pf.isPerfect(no); //Calling statement
			
			if(rs==true)
				System.out.println( no + " Is a Perfect No ");
			else
				System.out.println( no + " Is Not a Perfect No ");
		}
	}