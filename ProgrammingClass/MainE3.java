//Write a java program to check user entered no. is even or odd without using ifelse statement.
// Using Ternary operator


import java.util.Scanner;
	class MainE3{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int n = sc.nextInt();
			String st = (n%2==0)?"Even":"Odd";
			System.out.println(n + " is " + st + " Number" );
		}
	}