//Wajp to read any 3 integer no n find the biggest among those 3 using ternary operator.

import java.util.Scanner;

	class BiggestT{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter any three integers");
			int a,b,c,big;
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			
			big = (a>b && a>c)?a:(b>c)?b:c;
			
			System.out.println("Biggest value is "  + big);

		}
		
	}
