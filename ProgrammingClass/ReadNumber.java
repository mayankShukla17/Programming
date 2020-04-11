//Write a java program to read int no from user and check that no. is speacial 2 digit no. or not.

/*
59=(5+9)+(5*9)
	14+45
	59
	Speacial 2 digit no.
	
25=(2+5)+(2*5)
	7+10
	17
	Not speacial 2 digit no.
*/


import java.util.Scanner;
	class ReadNumber{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no.");
			int n = sc.nextInt();
			int d1 = n/10;
			int d2 = n%10;
			int sum = (d1+d2)+(d1*d2);
			if (sum == n){
				System.out.println(n + " is a speacial two digit no.");
			} 
			else{
				System.out.println(n + " is not a speacial two digit no.");
			}
		}
	}