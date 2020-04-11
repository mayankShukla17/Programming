/*
Wajp to read and print 4 sub marks of a student and print his result either fail or pass based on marks.
*/

import java.util.Scanner;

	class PassFail{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter four sub marks.");
			int sub1,sub2,sub3,sub4;
			sub1=sc.nextInt();
			sub2=sc.nextInt();
			sub3=sc.nextInt();
			sub4=sc.nextInt();
			
			
			
			/*if(sub1<35 || sub2<35 || sub3<35 || sub4<35)
				System.out.println("Result : Fail ");
			else
				System.out.println("Result : Pass ");*/
			
			/*if(sub1>=35 && sub2>=35 && sub3>=5 && sub4>=35)
				System.out.println("Result : Pass");
			else
				System.out.println("Result : Fail ");*/
			
			String rs = (sub1>=35 && sub2>=35 && sub3>=35 && sub4>=35)?"Pass":"Fail";
			System.out.println("Result : " + rs);

		}
		
	}
