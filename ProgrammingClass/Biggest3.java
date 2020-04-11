//Wajp to read any 3 integer no n find the biggest among those 3.
/*
Operators
Arithmetic Operators- (+ - / % *)
Relational Operators- (> < <= >= == !=)
Logical Operators-(| || & && !)
Multiple Operators- (5+6 > 1+2 && 3+5 <= 1+7) Arithmetic Operators gets highest priority>then Relational Operators> then Logical Operators
*/

import java.util.Scanner;

	class Biggest3{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter any three integers");
			int a,b,c,big;
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			if(a>b&&a>c)
				big = a;
			else if (b>c)
				big = b;
			else
				big = c;
			System.out.println("Biggest value is "  + big);

		}
		
	}
