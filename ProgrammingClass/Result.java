/*
Wajp to read 4 sub marks of a student based on that print his result distinction first class sec class pass or fail.48<
*/

import java.util.Scanner;
	class Result{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the subject marks");
			int maths = sc.nextInt();
			int science = sc.nextInt();
			int english = sc.nextInt();
			int hindi = sc.nextInt();
			
			float result=(maths+science+english+hindi)/4;
			
			if(result>=75 && result<=100)
				System.out.println(" Distinction " + result);
			else if(result>=61 && result<=74)
				System.out.println(" First Class " + result);
			else if(result>=48 && result<=60)
				System.out.println(" Second Class " + result);
			else if(result>=35 && result<=47)
				System.out.println(" Pass " + result);
			else if(result<35)
				System.out.println(" Fail " + result);
			else
				System.out.println(" Invalid marks " + result);
		}
	}