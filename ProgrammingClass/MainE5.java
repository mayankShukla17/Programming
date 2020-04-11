//Write a java program to check user entered no. is even or odd without using ifelse statement,Switch statements.
// using Array 


import java.util.Scanner;
	class MainE5{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int n = sc.nextInt();
			String st[] = {"Even","Odd"};
			System.out.println(n + " is " + st[n%2] + " Number ");
		}
	}