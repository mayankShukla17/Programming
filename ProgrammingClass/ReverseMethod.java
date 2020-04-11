/*
wajp to define a method to return reverse of no
*/

import java.util.Scanner;
	class ReverseMethod{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no");
			int n = sc.nextInt();
			int r=reverseMethod(n);
			System.out.println("The reverse number is :"+r);
		}
		
		static int reverseMethod(int x){
			int rev= 0;
			/*do{
				int r = x%10;
				rev=rev*10+r;
				x=x/10;
				
			}while(x!=0);
			*/
			while(x!=0){
				rev=rev*10;
				rev=rev+x%10;
				x=x/10;
			}
			
			return rev;
		}
	}