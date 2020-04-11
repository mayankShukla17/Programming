/*
Wajp to define a method to return the result of a student based on his 4 sub marks 
		result sould be like distinction first class second class pass fail
*/

import java.util.Scanner;
	class ResultMethod{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the subject marks");
			int maths = sc.nextInt();
			int science = sc.nextInt();
			int english = sc.nextInt();
			int hindi = sc.nextInt();
			
			String result = getResult(maths,science,english,hindi);
			
			System.out.println(" Result " + result);
		}
		
		static String getResult(int maths,int science,int english,int hindi){
			
			
			if(maths<35 || science<35 || english<35 || hindi<35)
				return "Fail";
			else {
				
			double per=(maths+science+english+hindi)/4.0;
			
			if(per>=85 && per<=100)
				return " Distinction " + per;
			else if(per>=60)
				return " First Class " + per;
			else if(per>=50 )
				return " Second Class " + per;
			else if(per>=35)
				return " Pass " + per;
			else
				return " Invalid marks " + per;
			
			}
		}
	}