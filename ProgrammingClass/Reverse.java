/*
Wajp to reverse the no
*/

import java.util.Scanner;
	class Reverse{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no");
			int n = sc.nextInt();
			int rev= 0;
			/*while(n!=0){
				rev=rev*10;
				rev=rev+n%10;
				n=n/10;
				}
				*/
				do{
					int r = n%10;
					rev=rev*10+r;
					n=n/10;
					
				}while(n!=0);
				
				System.out.println("The reverse number is :"+rev);
				}
	}