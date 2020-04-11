//Wajp to print ur name n times.

import java.util.Scanner;
	class Name{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the name");
			String name = sc.next();
			
			System.out.println("Enter the no of times to print ");
			int n = sc.nextInt();
			
			/*for (int i=1;i<=n;i++)
				System.out.println (name);
			*/
			
			while(n>0){
				System.out.println (name);
				n--;
				//break;
			}
				System.out.println ("Thank you");
		}
	}