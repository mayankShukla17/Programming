/*
Wajp to print the factorial of a no
*/

import java.util.Scanner;
	class Factorial{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no");
			int n = sc.nextInt();
			int fact=1;
			
			/*while(n>1){
				fact=fact*n;
				n--;
				//break;
			}
			*/

			for(int i=1;i<=n;i++){
				fact=fact*i;
			}
				System.out.println("Factorial " + fact);
		}
	}